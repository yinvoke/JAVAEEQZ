# JAVAEE期中项目

[TOC]

## 个人资料

软件1603尹宗文

尹宗文

201626010327



## 开发环境

系统环境：Windows10

开发环境：Intellij IDEA

数据库：MySQL

服务器：Tomcat



## 项目需求

该项目旨在实现一个简单的用户登录管理系统

将实现以下需求：

​	1.用户的注册

​	2.用户的登录

​	3.用户的注销

​	4.查看用户个人信息

​	5.个人信息的修改



## 技术使用

1.servlet

2.mvc结构

3.jsp页面

4.前端技术html+css+js

5.JDBC



## 数据库设计

![1543501187894](C:\Users\Invoker\AppData\Roaming\Typora\typora-user-images\1543501187894.png)

cars:车

users:用户

works:工作

houses:房屋





## 代码规范性设计

### 命名规范

​	包名：com.hnu.yzw.*

​	类名：首字母大写

​	变量名、方法名：驼峰原则

### 注释规范

​	方法功能注释

​	核心方法、难点出加注释

​	类、接口处注释



## 功能设计

​	用户注册功能

​	用户登录功能

​	用户信息查看功能

​	用户信息修改功能

​	用户密码修改功能

​	用户退出功能

​	管理员账户查看所有信息功能





## 项目结构说明

D:.
│  D?JAVAEE
│  JAVAEE.iml
│  list.txt
│  README.md
│  
├─.idea
│  │  misc.xml
│  │  modules.xml
│  │  uiDesigner.xml
│  │  workspace.xml
│  │  
│  ├─artifacts
│  │      JAVAEE_war_exploded.xml
│  │      
│  └─libraries
│          log4j_api_2_11_1.xml
│          mysql_connector_java_5_1_47_bin.xml
│          
├─lib
│      log4j-api-2.11.1.jar
│      mysql-connector-java-5.1.47-bin.jar
│      
├─out
│  ├─artifacts
│  │  └─JAVAEE_war_exploded
│  │      │  fixmessage.jsp
│  │      │  fixpwd.jsp
│  │      │  footer.jsp
│  │      │  fun.html
│  │      │  index.jsp
│  │      │  left.jsp
│  │      │  main.jsp
│  │      │  register.jsp
│  │      │  right.jsp
│  │      │  showmessage.jsp
│  │      │  showmessages.jsp
│  │      │  top.jsp
│  │      │  
│  │      ├─css
│  │      │      log.css
│  │      │      reg.css
│  │      │      showmes.css
│  │      │      
│  │      ├─function
│  │      ├─images
│  │      │      background.jpg
│  │      │      editor.png
│  │      │      exit.png
│  │      │      logo.png
│  │      │      
│  │      ├─js
│  │      │      CSSPlugin.min.js
│  │      │      EasePack.min.js
│  │      │      TweenLite.min.js
│  │      │      
│  │      ├─main
│  │      └─WEB-INF
│  │          │  web.xml
│  │          │  
│  │          ├─classes
│  │          │  │  log4j.properties
│  │          │  │  
│  │          │  └─com
│  │          │      └─hnu
│  │          │          └─yzw
│  │          │              ├─com
│  │          │              │  └─hnu
│  │          │              │      └─yzw
│  │          │              │          └─control
│  │          │              │                  MyOtherDbc.class
│  │          │              │                  MyOtherService.class
│  │          │              │                  MyUserDbc.class
│  │          │              │                  MyUserService.class
│  │          │              │                  
│  │          │              ├─controlimpl
│  │          │              │      OtherDbc.class
│  │          │              │      OtherService.class
│  │          │              │      UserDbc.class
│  │          │              │      UserService.class
│  │          │              │      
│  │          │              ├─model
│  │          │              │      Car.class
│  │          │              │      House.class
│  │          │              │      OM.class
│  │          │              │      User.class
│  │          │              │      Work.class
│  │          │              │      
│  │          │              └─servlet
│  │          │                      Servlet.class
│  │          │                      
│  │          └─lib
│  │                  log4j-api-2.11.1.jar
│  │                  mysql-connector-java-5.1.47-bin.jar
│  │                  
│  └─production
│      └─JAVAEE
│          │  log4j.properties
│          │  
│          └─com
│              └─hnu
│                  └─yzw
│                      ├─com
│                      │  └─hnu
│                      │      └─yzw
│                      │          └─control
│                      │                  MyOtherDbc.class
│                      │                  MyOtherService.class
│                      │                  MyUserDbc.class
│                      │                  MyUserService.class
│                      │                  
│                      ├─controlimpl
│                      │      OtherDbc.class
│                      │      OtherService.class
│                      │      UserDbc.class
│                      │      UserService.class
│                      │      
│                      ├─model
│                      │      Car.class
│                      │      House.class
│                      │      OM.class
│                      │      User.class
│                      │      Work.class
│                      │      
│                      └─servlet
│                              Servlet.class
│                              
├─src
│  │  log4j.properties
│  │  
│  └─com
│      └─hnu
│          └─yzw
│              ├─com
│              │  └─hnu
│              │      └─yzw
│              │          └─control
│              │                  MyOtherDbc.java
│              │                  MyOtherService.java
│              │                  MyUserDbc.java
│              │                  MyUserService.java
│              │                  
│              ├─controlimpl
│              │      OtherDbc.java
│              │      OtherService.java
│              │      UserDbc.java
│              │      UserService.java
│              │      
│              ├─model
│              │      Car.java
│              │      House.java
│              │      OM.java
│              │      User.java
│              │      Work.java
│              │      
│              └─servlet
│                      Servlet.java
│                      
└─web
​    │  fixmessage.jsp
​    │  fixpwd.jsp
​    │  footer.jsp
​    │  fun.html
​    │  index.jsp
​    │  left.jsp
​    │  main.jsp
​    │  register.jsp
​    │  right.jsp
​    │  showmessage.jsp
​    │  showmessages.jsp
​    │  top.jsp
​    │  
​    ├─css
​    │      log.css
​    │      reg.css
​    │      showmes.css
​    │      
​    ├─images
​    │      background.jpg
​    │      editor.png
​    │      exit.png
​    │      logo.png
​    │      
​    ├─js
​    │      CSSPlugin.min.js
​    │      EasePack.min.js
​    │      TweenLite.min.js
​    │      
​    ├─main
​    └─WEB-INF
​            web.xml
​            