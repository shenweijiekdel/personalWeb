<template>
  <div class="main">
    <el-row :gutter="10">
      <el-col :span="24">

        <el-card body-style="" shadow="hover">
          <div slot="header">个人信息</div>

          <el-row :gutter="10">
            <el-col :span="10" :offset="2">
              <el-row :gutter="5">
                <el-col :span="5">
                  姓名:
                </el-col>
                <el-col :span="19">
                  沈伟杰
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="5">
                  名族:
                </el-col>
                <el-col :span="19">
                  汉
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="5">
                  住址:
                </el-col>
                <el-col :span="19">
                  北京
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="8">
                  出生年月:
                </el-col>
                <el-col :span="16">
                  1994.09
                </el-col>
              </el-row>
              <el-row :gutter="10">
                <el-col :span="5">
                  邮箱:
                </el-col>
                <el-col :span="19">
                  shenweijiekdel@sina.com
                </el-col>
              </el-row>
            </el-col>
            <el-col :span="10">
              <el-row :gutter="5">
                <el-col :span="5">
                  性别:
                </el-col>
                <el-col :span="19">
                  男
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="8">
                  毕业院校:
                </el-col>
                <el-col :span="16">
                  内蒙古工业大学
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="5">
                  专业:
                </el-col>
                <el-col :span="19">
                  计算机科学与技术
                </el-col>
              </el-row>
              <el-row :gutter="5">
                <el-col :span="5">
                  学历:
                </el-col>
                <el-col :span="19">
                  本科
                </el-col>
              </el-row>
              <el-row :gutter="10">
                <el-col :span="5">
                  电话
                </el-col>
                <el-col :span="19">
                  15548720906
                </el-col>
              </el-row>
            </el-col>
          </el-row>

        </el-card>
      </el-col>

    </el-row>
    <el-row>
      <el-col>
        <el-card>
          <div slot="header">教育背景</div>
          <h3>2014.09—2018.6              内蒙古工业大学                 计算机科学与技术                本科 </h3>
          主修课程：
          程序设计基础，计算机科学引论，网站设计，面向对象程序设计，
          数据结构与算法，数据库系统原理，JAVA高级语言程序设计，微型计算机技术，计算机组成与结构，Web程序设计，操作系统，软件工程，嵌入式操作系统，嵌入式设计与开发，单片机技术，网站设计，编译原理，计算机网络，JSP开发技术，Linux操作系统，SQL Server数据库应用等
        </el-card>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="24">
        <el-card body-style="padding:50px;padding-top:0px;">
          <div slot="header">专业技能</div>
          <div >
            <h3>熟悉JAVA语言，熟悉JAVA并发编程，网络编程，TCP/UDP通信协议及HTTP协议</h3>
            <h3>熟悉JAVA面向对象编程，熟悉反射与动态代理，以及多线程与NIO</h3>
            <h3>能够熟练使用Intellij IDEA,Eclipse等集成开发环境进行JAVA项目的开发</h3>
            <h3>熟悉Maven的基本命令与配置使用，能够熟练使用Maven进行项目的依赖管理</h3>
            <h3>熟悉Git基本命令，能够熟练使用Git版本控制系统进行多人协作开发</h3>
            <h3>熟悉Spring，SpringMVC，Mybatis (SSM) 框架，熟悉Spring IOC，DI以及AOP，熟悉SpringBoot，能够独立使用进行高质量项目的开发。</h3>
            <h3>熟悉HTML，CSS，Javascript等前端语言，能够独立完成HTML页面的布局与美化。以及使用Js操作Dom元素和前端逻辑编写。</h3>
            <h3>熟悉Jquery，Bootstrap，Vue等前端框架，熟悉Node.js环境，能够配合Webpack进行前后端完全分离的项目开发。</h3>
            <h3>熟悉Jquery，Bootstrap，Vue等前端框架，熟悉Node.js环境，能够配合Webpack进行前后端完全分离的项目开发。</h3>
            <h3>了解SQL注入，XSS跨站脚本攻击，CSRF跨站请求伪造等常见Web安全漏洞的原理，能够在开发中避免这些漏洞的产生。</h3>
            <h3>熟悉Ajax异步请求，Json数据格式，能够使用Ajax进行页面的动态渲染。</h3>
            <h3>熟悉SQL语句，能够编写高效SQL语句数据库操作，了解传统关系型数据库，NoSql以及NewSql新型数据库的区别，熟悉Redis缓存，能够使用Redis解决并发IO瓶颈。</h3>
            <h3>能够熟练使用HAProxy、Nginx等负载均衡器进行负载均衡和反向代理以及用户IP透传</h3>
            <h3>熟悉Linux操作系统，命令以及服务器搭建，配置，与维护，能够分析日志解决大部分故障。</h3>
            <h3>熟悉Shell脚本，能够自如地在linux环境下进行工作</h3>
            <h3>能够熟练使用logback，log4j等日志框架进行日志滚动输出，并且出现问题能高效分析出问题所在以及解决方案</h3>
            <h3>了解分布式，拥有基本的分布式架构设计理念，能够熟练进行分布式服务的搭建。</h3>
            <h3>善于发现问题，能够找出架构以及代码中的性能瓶颈，并采取相应的优化措施。</h3>
          </div>

        </el-card>
      </el-col>

    </el-row>
    <el-row>
      <el-col :span="24">
        <el-card>
          <div slot="header">项目经验</div>
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
        <el-card>
          <div slot="header">荣誉奖励</div>
          <h2>2016 内蒙古工业大学“学风杯”第十届ACM/ICPC大学生程序设计竞赛 （二等奖） </h2>
          <h2>2017 内蒙古工业大学“学风杯”第十一届ACM/ICPC大学生程序设计竞赛 （二等奖） </h2>
          <h2>2016 大学生创新创业活动机器人大赛 (三等奖) </h2>
          <h2>2016 RobCup中国机器人大赛 越障与搜救组 （二等奖）</h2>
        </el-card>
      </el-col>
    </el-row>
    <el-row>
      <el-col>
        <el-card>
          <div slot="header">自我评价</div>
          我的心态永远处于乐观状态，而且对专业热情度极高，拥有极高的耐心，在专业问题的研究上永远不会觉得累，反而异常兴奋，所以不惧怕任何技术问题，拥有很强的问题分析及解决能力，并且能够快速上手新事物，自学能力强。工作认真负责，能够把自己的全部能力输出给公司，乐于助人，并且易于相处。爱好Android刷机和折腾ArchLinux
        </el-card>
      </el-col>
    </el-row>
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
    color: #4e4e4e;
    font-size: 12px;
  }

  .main {
    width: 60%;
    display: inline-block;
    text-align: left;
  }
</style>
