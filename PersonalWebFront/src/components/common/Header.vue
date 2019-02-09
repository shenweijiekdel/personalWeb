<template>
  <div class="header">
    <div class="header-top">
      <div>
        <el-tooltip content="996300526">

        <div class="top-btn">
          <i class="fa fa-qq"></i>
        </div>
        </el-tooltip>
        <el-tooltip content="shenweijiekdel">
        <div class="top-btn">
          <i class="fa fa-weixin"></i>
        </div>
        </el-tooltip>
        <el-tooltip content="https://github.com/shenweijiekdel">
        <div class="top-btn">
          <i class="fa fa-github"></i>
        </div>
        </el-tooltip>
      </div>

    </div>
    <div class="header-middle">
      <div class="text-wrapper">
        <h1>沈伟杰</h1>
        <h2>JAVA工程师</h2>
        <div class="introduce">
          本人擅长JAVA，熟悉常用的数据结构，熟悉TCP/UDP，MQTT以及HTTP传输协议，能够熟练使用各种框架进行高质量Web项目的开发，熟悉SSM与SpringBoot，了解分布式应用，同时熟悉Javascript，Html，Css，能够使用Vue，BootStrap进行前端开发以及美化，熟悉XSS，CSRF，SQL注入等常见的Web安全漏洞原理并加以避免。熟悉Linux操作系统，了解各个发型版本的特点，能够熟练使用Linux进行服务的搭建与维护，拥有很强的问题解决能力，能够分析出性能瓶颈，并且能够快速上手新事物，自学能力强，喜欢钻研，工作认真负责，乐于助人，并且易于相处。

        </div>
      </div>
    </div>
    <div class="header-contact">

      <div style="display: inline-block;margin-right:20px"><i class="fa fa-envelope" style="margin-right:20px"></i>shenweijiekdel@sina.com</div>

      <div style="display: inline-block"><i class="fa fa-phone" style="margin-right:20px"></i>15548720906</div>
      <!--<div></div>-->
      <!--<div></div>-->
    </div>
    <div class="header-navigation">
      <router-link to="/Dashboard">
        <div class="navigation" > 个人主页</div>
      </router-link>
      <router-link to="/TravelPlan">
        <div class="navigation">旅行日志</div>
      </router-link>
    </div>
   <!-- <el-row type="flex" style="width: 20%;display: inline-block">
      <el-col :span="8">
       &lt;!&ndash; <router-link  to="/Dashboard">
          <div class="navigation">个人简历</div>
        </router-link>&ndash;&gt;

      </el-col>
      <el-col :span="8">
        <router-link to="/TravelPlan">
          <div class="navigation">旅行日志</div>
        </router-link>

      </el-col>

    </el-row>-->
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
    margin-top: 80px;
    color: white;

  }
  >>>a {
    text-decoration: none;
  }
  .navigation {
    text-align: center;
    color: #FFF;
    cursor: pointer;
    font-size: 18px;
    text-underline-mode: false;
    -moz-transition: 0.5s;
    -ms-transition: 0.5s;
    padding: 10px;
    -o-transition: 0.5s;
    -webkit-transition: 0.5s;
  width:100px;
    padding-top: 20px;
    padding-bottom: 20px;

    transition: 0.5s;
    display: inline-block;
  }

  .navigation:hover {
    color: #FFFFFF;
    background: rgba(0, 0, 0, 0.2);
  }
  .header-top {
    background-color:#8cc5ff;
    padding-top:10px;
    text-align: left;
    padding-left: 10px;
    padding-bottom: 100px;
  }
  .header-middle {
    padding-top:90px;
    padding-bottom:60px;
    background-color:#3a9cf4;
    text-align: center;
  }
  .header-contact {
    text-align: center;
    background-color:#3b80d4;
    font-size: 20px;
    position: relative;
    padding-top:30px;
    padding-bottom: 30px;
  }
  /*.header-contact div{
    text-align-all: center;
    display: inline-block;
  }*/
  .header-navigation {
    background-color:#336ab8;


  }
  .text-wrapper {
    padding-left: 10px;
    padding-right: 10px;
    margin-left: 20%;
    width:auto;
    margin-right: 20%;
    line-height: 30px;
    display: block;
  }
  .introduce{
    font-size:15px;
    font-weight: lighter;
  }
  .text-wrapper h1{
    font-size: 50px ;
    letter-spacing: 5px;
  }
  .text-wrapper h2{
    font-weight: lighter;
    letter-spacing: 2px;
  }
  .text-wrapper div{
    display: inline-block;

    letter-spacing: 1px;
  }
  .top-btn{
    text-align: center;
    width: 30px;
    height: 30px;
    padding:3px;
    color:#FFFFFF88;
    border-radius: 100%;
    border:solid #FFFFFF88 2px;
    display: inline-block;
    transition: 0.5s;
    margin-right: 20px;


  }
  .top-btn:hover {
    color:#FFF;
    border-color:#fff;
    cursor: pointer;

  }
</style>
