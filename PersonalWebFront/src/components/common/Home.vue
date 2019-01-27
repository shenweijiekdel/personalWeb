<template>
  <div class="wrap">
    <el-header>
      <v-head></v-head>
    </el-header>
    <div class="main-wrapper">
      <router-view/>

    </div>
  </div>
</template>

<script>
  import vHead from './Header.vue'

  export default {
    data () {
      return {}
    },
    components: {
      vHead
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.wrap{
  background-image: url("../../../static/img/bak.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: left;
  background-origin: content-box;
  position: fixed;
  width:100%;
  height: 100%;
  margin:0;
  overflow: scroll;
}
  .el-header {
    text-align:right;
    padding-right: 20%;
  }
  .main-wrapper {
    background:#FFFFFF55;
    padding:20px;
    width:100%;
    display: inline-block;
    overflow: hidden;
  }
</style>
