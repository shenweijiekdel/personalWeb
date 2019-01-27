<template>
  <div class="main">

     <div id="map" style="width:100%;height:800px;box-shadow: gray 0 0 5px 5px ">
       <transition name="el-zoom-in-top">
       <el-card class="info-card" body-style="color:gray;font-size:12px;padding:10px;" v-if="infoPanel.visible">
         <i class="el-icon-close info-card-close" @click="handlePanelClose"></i>
           <el-row  type="flex">
             <el-col :span="5" >
              <i class="el-icon-location" ></i>
             </el-col>
             <el-col :span="19" style="font-weight: bold">
              {{infoPanel.province}}
             </el-col>


           </el-row>
         <div class="cut-line"></div>
         <div v-if="infoPanel.dataRef">

        <el-row >
          <el-col :span="4">
            <i class="el-icon-time"></i>
          </el-col >
          <el-col :span="20">
            {{time}}
          </el-col>
          <el-col :span="4">
            <i class="el-icon-tickets"></i>
          </el-col>
          <el-col :span="20">
            {{remark}}
          </el-col>
        </el-row>
         </div>
         <div v-else >
           <el-row>
             <el-col>
               <div>您还没有旅游过此地，做个计划？</div>
             </el-col>
             <el-col style="text-align: center">
               <div><el-button type="primary" size="mini" @click="makePlan">{{doPlainLabel}}</el-button></div>
             </el-col>
           </el-row>
           <transition name="el-zoom-in-top">

          <div v-if="doPlaining" style="text-align: left;">

            <el-form :model="form">

              <el-form-item >
                <el-date-picker
                  v-model="form.time"
                  format="yyyy-MM-dd"
                  value-format="timestamp"
                  type="date"
                  placeholder="选择日期" size="mini" style="width:180px">
                </el-date-picker>
              </el-form-item>
              <el-form-item >
                <el-input
                  type="textarea"
                  :rows="2"
                  placeholder="备注"
                  v-model="form.remark">
                </el-input >
              </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
              <el-button type="primary" @click="handleSubmit" size="mini">提交</el-button>
            </div>
          </div>
           </transition>

         </div>
       </el-card>
       </transition>
     </div>

  </div>
</template>

<script>
  import {
    getAllTravelLogs,
    makePlan
  } from '../../../api/api'

  export default {
    data () {
      return {
        doPlaining:false,
        form: {
          province:'',
          remark:'',
          time: '',
        },
        dialogFormVisible:false,
        data:[],
        zoom: 4,
        dataMap:new Map(),
        initialCenter: [105.671214, 37.577583],
        center: [105.671214, 37.577583],


        infoPanel: {
          province:'',
          time:'',
          remark:'',
          visible: false,
          dataRef:undefined
        },
      }

    },
    mounted() {
      this.initAMap();
      // this.getData()
    },
    beforeDestroy () {
      this.map?this.map.destroy():this.map = undefined;
    },
    computed: {
      time(){
        return this.infoPanel.dataRef?this.infoPanel.dataRef.time:'--';
      },
      remark(){
        return this.infoPanel.dataRef?this.infoPanel.dataRef.remark:'--';
      },
      doPlainLabel(){
        return this.doPlaining?'取消':'做计划';
      }
    },

    methods: {
      initAMap(){
        let _this = this;
        let map = new AMap.Map('map',{
          resizeEnable: true, //是否监控地图容器尺寸变化
          zoom:this.zoom, //初始化地图层级
          center: this.initialCenter //初始化地图中心点
        })
          AMap.plugin(['AMap.ToolBar','AMap.Geocoder'],()=>{
          let toolbar = new AMap.ToolBar({
            position:'LB'
          });
          map.addControl(toolbar);

        })

        _this. infoWindow = new AMap.InfoWindow();


        AMapUI.load(['ui/geo/DistrictExplorer', 'lib/$'], function(DistrictExplorer, a) {

          //创建一个实例
          _this.districtExplorer = window.districtExplorer = new DistrictExplorer({
            eventSupport: true, //打开事件支持
            map: map
          });

          _this.getData()
        })

        this.map = map;
      },
      updateContent(lngLat,feature){
        let newVar = this.dataMap.get(feature.properties.name)
        if (newVar){
          if (newVar.gone)
          this.infoWindow.setContent(newVar.province + " " + newVar.time + " 去过")
          else
          this.infoWindow.setContent(newVar.province + " 将于" + newVar.time + "旅行")
        } else{
          this.infoWindow.setContent(feature.properties.name + " " + "目前还没有计划")
        }
          this.infoWindow.open(this.map,[lngLat.lng,lngLat.lat])



      },
      async getData(){
      await  getAllTravelLogs().then(res =>{
          let {code,msg,data} = res
          let type ;

          if (code != 200)
            type = 'error'
          else {
            type = 'success'
            for (let i=0; i<data.length; i++){
              let key = data[i].province
              this.dataMap.set(key,data[i])
            }
          }
          this.$notify({
            message:msg,
            type,type
          })
        this.loadProvinceStatus();
          if (this.feature)
        this.focus();
        console.log(data)

        })
      },


      loadProvinceStatus(){
        let _this = this
        let colors = ['#6599ff','#65ff99','#ff5555']
        this.districtExplorer.loadAreaNode(100000,(error,areaNode)=>{
          //更新地图视野
          this.districtExplorer.clearFeaturePolygons();
          this.map.setBounds(areaNode.getBounds(), null, null, true);

          /**
           * 很奇怪，切了页面再回来map实例应该是销毁重建了，但是districtExplorer的hover效果就没了，经检查切换页面回来以后_districtExplorer.areaNodesForLocating属性为null，暂时这么解决把。
           */
          if ( this.districtExplorer._areaNodesForLocating == null) //如果为null就把areaNode设回去
            this.districtExplorer._areaNodesForLocating = [areaNode]
          //清除已有的绘制内容


          //绘制子区域
          this.districtExplorer.renderSubFeatures(areaNode, function(feature, i) {
            let data = _this.dataMap.get(feature.properties.name)
            return {
              cursor: 'default',
              bubble: true,
              strokeColor: '#0071ff', //线颜色
              strokeOpacity: 1, //线透明度
              strokeWeight: 0.2, //线宽
              fillColor: data && data.gone?colors[1]: data && !data.gone?colors[0]:colors[2] , //填充色
              fillOpacity: 0.5, //填充透明度
            };
          });

          //绘制父区域
          this.districtExplorer.renderParentFeature(areaNode, {
            cursor: 'default',
            bubble: true,
            strokeColor: '#0071ff', //线颜色
            strokeOpacity: 1, //线透明度
            strokeWeight: 1, //线宽
            fillColor: null, //填充色
            fillOpacity: 0.5, //填充透明度
          });
          this.districtExplorer.on('featureMouseout featureMouseover', (e, feature)=> {

            let polys =  this.districtExplorer.findFeaturePolygonsByAdcode(feature.properties.adcode);
            for (let i = 0, len = polys.length; i < len; i++) {

              polys[i].setOptions({
                fillOpacity:   e.type == 'featureMouseover'?0.2:0.5
              });
            }
          });
          this.districtExplorer.on('featureClick', function(e, feature) {
            _this.feature = feature;
            _this.focus()
          });
          //监听鼠标在feature上滑动

          this.districtExplorer.on('featureMousemove', function(e, feature) {
            //更新提示位置

            _this.updateContent(e.originalEvent.lnglat,feature);
          });
        })
      },

      handlePanelClose(){
        this.blur();
        this.map.setZoom(this.zoom)
      },
      blur(){
        this.infoPanel.visible = false;
        this.infoPanel.dataRef = undefined;
        // this.map.setZoom(this.zoom)

        this.map.setCenter(this.initialCenter)
      },
      focus(){
        this.blur();
        this.infoPanel.dataRef = this.dataMap.get(this.feature.properties.name)

        // this.setContent(feature)
        this.map.setCenter(this.feature.properties.center)
        setTimeout(()=>{
          this.map.setZoom(5);
        },500)
        this.infoPanel.province = this.feature.properties.name;
        this.form.province = this.infoPanel.province;
        this.infoPanel.visible = true;

      },
      makePlan(){
        console.log(this.form.province)

        this.doPlaining = !this.doPlaining;
      },
         handleSubmit(){
        console.log(this.form)
       makePlan(this.form).then(res =>{
          let {code,msg} = res;
          let type;
         console.log(res)
          if (code != 200){
            type = 'error'
          } else
            type = 'success'
          this.$notify({
            message:msg,
            type:type
          })
           this.getData();


        })

      },
    }

  }
</script>

<style scoped>
  .main {
    text-align: center;
    display: inline-block;
    width:60%
  }

  .el-col {

    /*border:solid 1px*/
    text-align:left;
    margin-bottom:10px;
  }




  .info-card-close {
    width: 10px;
    height: 10px;
    float: right;
    color: #3a96e1;
    font-size: 13px;
    z-index: 1000;
    position: relative;

  }

  .info-card-close:hover {
    color: rgb(230, 103, 94);
    cursor: pointer;
  }

  .info-card {
    background:rgba(255,255,255,0.8);
    width:300px;
    position: absolute;
    left:10px;
    top:100px;
    z-index: 10000;

  }
  .cut-line{
    width:80%;
    height:1px;
    background: lightgray;
    margin-bottom:10px;
  }

</style>
