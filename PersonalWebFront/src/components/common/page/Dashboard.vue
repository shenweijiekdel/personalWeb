<template>
  <div class="main">
    <section id="skills-section" class="skills-section section text-center">
      <h2 class="section-title">专业技能</h2>
      <div class="top-skills">
        <h3 class="subtitle">主要技能</h3>
        <div class="row">
          <div class="item col-xs-12 col-sm-4">
            <div class="item-inner">
              <div class="chart-easy-pie text-center">
                <el-progress type="circle" :percentage="90"></el-progress>
              </div>
              <h4 class="skill-name">Java &amp; Web后端</h4>
              <div class="level">3年Java使用经验</div>
              <div class="desc">
                擅长Java，能够使用Java语言进行服务中间件，桌面程序以及Web服务后端接口的开发，熟悉Java面向对象，反射，动态代理，网络编程，并发编程以及BIO和NIO，了解JVM规范，能够根据实际场景进行内存调优，熟悉Spring IOC，DI以及AOP。
              </div>
            </div><!--//item-inner-->
          </div><!--//item-->
          <div class="item col-xs-12 col-sm-4">
            <div class="item-inner">
              <div class="chart-easy-pie text-center">
                <el-progress type="circle" :percentage="80"></el-progress>
              </div>
              <h4 class="skill-name">JavaScript &amp; Web前端</h4>
              <div class="level">2年JavaScript使用经验</div>
              <div class="desc">S
                能够使用JavaScript进行对Dom元素的操作，前端逻辑编写，页面异步渲染，能够熟练运用BootStrap，JQuery，Vue等前端框架进行前端开发，
              </div>
            </div><!--//item-inner-->
          </div><!--//item-->
          <div class="item col-xs-12 col-sm-4">
            <div class="item-inner">
              <div class="chart-easy-pie text-center">
                <el-progress type="circle" :percentage="90"></el-progress>
              </div>
              <h4 class="skill-name">Linux</h4>
              <div class="level">3年Linux使用经验</div>
              <div class="desc">
                熟悉Linux操作系统，能够熟练运用Linux操作系统进行日常工作，美化定制，服务搭建,项目部署等，熟悉Shell脚本，能够编写Shell脚本对服务进行管理，
              </div>
            </div><!--//item-inner-->
          </div><!--//item-->
        </div><!--//row-->
      </div><!--//top-skills-->

      <div class="other-skills">
        <h3 class="subtitle">其他技能</h3>
        <div class="misc-skills">
          <span class="skill-tag">HTML5</span>
          <span class="skill-tag">CSS</span>
          <span class="skill-tag">Go</span>
          <span class="skill-tag">Git</span>
          <span class="skill-tag">MySql</span>
          <span class="skill-tag">Redis</span>
          <span class="skill-tag">CockroachDB</span>
          <span class="skill-tag">MongoDB</span>
          <br>
          <span class="skill-tag">Android</span>
          <span class="skill-tag">Intellij IDEA</span>
          <span class="skill-tag">Eclipse</span>
          <span class="skill-tag">Node.js</span>
          <span class="skill-tag">Tomcat</span>
          <span class="skill-tag">Maven</span>
          <span class="skill-tag">Nginx</span>
          <span class="skill-tag">HAproxy</span>
        </div>
      </div><!--//other-skills-->

    </section><!--//skills-section-->
          <section id="experiences-section" class="section">
            <h2 class="section-title">教育背景</h2>
            <div class="timeline">
              <div class="item">
                <div class="work-place">
                  <h3 class="place">计算机科学与技术(本科)</h3>
                  <div class="location"><i class="fa fa-map-marker" aria-hidden="true"></i>呼和浩特</div>
                </div>
                <div class="job-meta">
                  <div class="title">内蒙古工业大学</div>
                  <div class="time">2014.09 - 2018.06</div>
                </div><!--//job-meta-->
                <div class="job-desc">
                  <p> 主修程序设计基础，计算机科学引论，网站设计，面向对象程序设计，
                    数据结构与算法，数据库系统原理，JAVA高级语言程序设计，微型计算机技术，计算机组成与结构，Web程序设计，操作系统，软件工程，嵌入式操作系统，嵌入式设计与开发，单片机技术，网站设计，编译原理，计算机网络，JSP开发技术，Linux操作系统，SQL Server数据库应用等课程
                  </p>
                  <ul>
                    <li>在校期间担任即刻电脑协会副会长</li>
                    <li>在校期间担任双节棍协会会长</li>
                  </ul>

                </div><!--//job-desc-->
              </div><!--//item-->

            </div><!--//timeline-->

          </section><!--//section-->




    <!--<el-row>
      <el-col :span="24">
        <el-card shadow="hover">
          <div slot="header" class="card-header">项目经验</div>
          <div>
            <h2>基于分布式架构的数控机床数据监控分析PAAS平台</h2>
            <div>
              <h3 style="margin-left: 4%;">项目介绍</h3>
              <div style="width:80%;margin-left:8%">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本项目主要针对机床厂，能够快速接入并管理注册用户及公司的所有机床设备，用户只要提供要采集的数据模型即可快速接入设备，按照工厂以及用户对设备和进行分配，实时查看设备的运行状态，地理位置，报警信息以及产量统计，服务器采用3+1负载均衡，主要通过中间件App基于MQTT协议实现数据的接收存储，设备上下线监控统计，dtu位置请求，业务数据库同步，服务器资源监控以及报表统计流式计算等等，运行于个节点上稳定运行提供服务，Web端采用Node.js
                + vue和SpringBoot实现前后端完全分离。
              </div>
            </div>
          </div>
          <div>
            <h3 style="margin-left: 4%;">主要技术</h3>
            <div style="width:80%;margin-left:8%">
              <div> 中间件：Mqtt通信 + JAVA并发编程 + logback日志系统
              </div>
              <div> Web前端：Node.js + Vue + 高德地图Api
              </div>
              <div> Web后端：Spring Boot + Mybatis + JWT验证
              </div>
            </div>
          </div>
          <div>
            <h3 style="margin-left: 4%;">负责模块</h3>
            <div style="width:80%;margin-left:8%">
              <div>              中间件Task：分布式架构服务搭建，数据存储task，设备定位task，hash同步task，基于 Windows的并发设备模拟测试工具。
              </div>
              <div>              Web：服务器资源监控模块，设备上下线监控模块，设备上下线统计模块，设备信息管理模块，设备定位模块。
              </div>
            </div>
          </div>

          <div>
            <h2>面向智能移动终端的教学系统</h2>
            <div>
              <h3 style="margin-left: 4%;">项目介绍</h3>
              <div style="width:80%;margin-left:8%">
                本项目是基于Web服务端和Android客户端的`一款教学系统，教师可以登陆到Web后台进行课程的创建和添加小节视频，导入excel题库，查看选择自己课程的学生，学生客户端可以进行选课，观看教学视频，在评论区进行讨论，每一小节学习过后有测试，测试通过才能进行下一节。教师还可以通过Android教师客户端进行查看课程与学生的学习情况，并与学生交流。
              </div>
            </div>
          </div>
          <div>
            <h3 style="margin-left: 4%;">主要技术</h3>
            <div style="width:80%;margin-left:8%">
              <div>  服务端：SpringBoot + Mybatis + Ajax + Layui + jQuery + POI
              </div>
              <div> 客户端：OkHttp + 阿里云短信验证接口
              </div>
            </div>
          </div>
          <div>
            <h3 style="margin-left: 4%;">负责模块</h3>
            <div style="width:80%;margin-left:8%">
              全部
            </div>
          </div>
        </el-card>
      </el-col>


    </el-row>
    <el-row>
      <el-col>
        <el-card shadow="hover">
          <div slot="header" class="card-header">荣誉奖励</div>
          <h2>2016 内蒙古工业大学“学风杯”第十届ACM/ICPC大学生程序设计竞赛 （二等奖） </h2>
          <h2>2017 内蒙古工业大学“学风杯”第十一届ACM/ICPC大学生程序设计竞赛 （二等奖） </h2>
          <h2>2016 大学生创新创业活动机器人大赛 (三等奖) </h2>
          <h2>2016 RobCup中国机器人大赛 越障与搜救组 （二等奖）</h2>
        </el-card>
      </el-col>
    </el-row>-->

  </div>
</template>

<script>
  export default {
    data () {
      return {}
    }
  }
</script>

<style scoped>
  .el-col {
  }

  .el-row {
    margin-bottom: 10px;
  }

  .el-card {
    margin-bottom: 10px;
    color: #666;
    font-size: 15px;
    line-height: 25px;
  }
  .card-header {
    font-size: 18px;
    font-weight: bold;
  }

  .main {
    width: 60%;
    display: inline-block;
    text-align: left;
  }
  .timeline {
    border-left: 3px solid #00BCD4;
    border-bottom-right-radius: 2px;
    border-top-right-radius: 2px;
    position: relative;
    padding: 0 30px;
    margin-left: 280px;
  }
  .timeline .item {
    position: relative;
    margin-bottom: 45px;
  }
  .timeline .item:last-child {
    margin-bottom: 0;
  }
  .timeline .item:before {
    content: "";
    position: absolute;
    left: -43px;
    top: 0;
    display: inline-block;
    width: 22px;
    height: 22px;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    -ms-border-radius: 50%;
    -o-border-radius: 50%;
    border-radius: 50%;
    -moz-background-clip: padding;
    -webkit-background-clip: padding-box;
    background-clip: padding-box;
    background: #fff;
    border: 3px solid #00BCD4;
  }
  .timeline .item:after {
    content: "";
    position: absolute;
    left: -37px;
    top: 6px;
    display: inline-block;
    width: 10px;
    height: 10px;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    -ms-border-radius: 50%;
    -o-border-radius: 50%;
    border-radius: 50%;
    -moz-background-clip: padding;
    -webkit-background-clip: padding-box;
    background-clip: padding-box;
    background: #00BCD4;
    z-index: 10;
  }
  .timeline .work-place {
    position: relative;
  }
  .timeline .location {
    position: absolute;
    right: 0;
    top: 2px;
    color: #8a8a8a;
  }
  .timeline .location .fa {
    margin-right: 5px;
  }
  .timeline .place {
    margin-top: 0;
    margin-bottom: 15px;
    font-size: 20px;
    font-weight: 300;
  }
  .timeline .job-meta {
    position: absolute;
    left: -200px;
    top: 0;
  }
  .timeline .job-meta .title {
    font-size: 18px;
    color: #2aabd2;
  }
  .timeline .job-meta .time {
    color: #8a8a8a;
  }
  .timeline .job-desc {
    color: #666;
  }
  .section {
    -webkit-box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    -moz-box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    padding: 45px;
    background: #fff;
    margin-bottom: 45px;
    -webkit-border-radius: 2px;
    -moz-border-radius: 2px;
    -ms-border-radius: 2px;
    -o-border-radius: 2px;
    line-height: 30px;
    color:#666;
    border-radius: 2px;
    -moz-background-clip: padding;
    -webkit-background-clip: padding-box;
    background-clip: padding-box;
    margin-top:45px;
  }
  .section:last-child {
    margin-bottom: 0;
  }
  .section-title {
    margin-top: 0;
    margin-bottom: 45px;
    font-size: 24px;
    color: #333;

    text-align: center;
  }

  .skills-section .subtitle {
    font-size: 18px;
    color: #8a8a8a;
    margin-top: 0;
    margin-bottom: 45px;
    font-weight: 300;
  }
  .skills-section .top-skills {
    margin-bottom: 60px;
  }
  .skills-section .top-skills .item {
    margin-bottom: 45px;
  }
  .skills-section .level {
    color: #8a8a8a;
    margin-bottom: 15px;
  }
  .skills-section .desc {
    color: #666;
  }
  .skills-section .skill-tag {
    -webkit-box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    -moz-box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.14);
    padding: 3px 20px;
    display: inline-block;
    margin-right: 10px;
    border: 1px solid #f5f5f5;
    font-weight: 500;
    margin-bottom: 15px;
    font-size: 16px;
    color: #333;
  }
  .chart-easy-pie {
    positon: relative;
  }

</style>
