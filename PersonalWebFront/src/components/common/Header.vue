<template>
  <div class="header">
    <el-row type="flex" style="width: 20%;display: inline-block">
      <el-col :span="8">
        <router-link  to="/Dashboard">
          <div class="navigation">个人简历</div>
        </router-link>

      </el-col>
      <el-col :span="8">
        <router-link to="/TravelPlan">
          <div class="navigation">旅行日志</div>
        </router-link>

      </el-col>

    </el-row>
  </div>

</template>

<script>
  export default {
    data () {
      return {}
    },
    methods: {
      aa () {
      }
    }
  }
</script>

<style scoped>
  .header {
    font-family: '微软雅黑', 'Consolas';
    padding: 10px;
    margin-top: 60px;
  }
  >>>a {
    text-decoration: none;
  }
  .navigation {
    text-align: center;
    color: #FFF;
    cursor: pointer;
    font-size: 15px;
    font-weight: bold;
    text-underline-mode: false;
    -moz-transition: 0.5s;
    -ms-transition: 0.5s;
    padding: 10px;
    border-radius: 20px 20px 20px 20px;
    -o-transition: 0.5s;
    -webkit-transition: 0.5s;
  width:80px;
    transition: 0.5s;
  }

  .navigation:hover {
    color: #FFFFFF;
    background: rgba(0, 0, 0, 0.2);
  }
</style>
