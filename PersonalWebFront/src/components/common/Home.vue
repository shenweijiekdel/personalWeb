<template>
  <div >
    <!--<el-header>-->
      <v-head></v-head>
    <!--</el-header>-->
    <!--<div class="main-wrapper">-->
      <!--<router-view/>-->

    <!--</div>-->
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

  .el-header {
  }
  .main-wrapper {
    padding:20px;
    width:100%;
    display: inline-block;
    overflow: hidden;
  }
</style>
