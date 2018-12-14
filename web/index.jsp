<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/27
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>登录</title>
  <meta charset="utf-8">
  <meta name="author" content="Yinvoker">
  <link rel="stylesheet" type="text/css" href="css/log.css">
</head>
<body>

<div  class="main">
  <form action="my" method="post">
    <input type="hidden" name="oper" value="login" />
    <div class="head"><h1 class="zi">信息管理系统</h1></div>
    <p class="zi1">User name<br>
      <input type="text" name="uname" placeholder="输入用户名" class="input"><br></p>
    <p class="zi1">Password<br>
      <input type="password" name="pwd" placeholder="输入密码" class="input">
      <%
        Object o = request.getAttribute("flag");
        if(o!=null){
      %>
      <br><span style="color: red">用户名或密码输入错误</span>
      <%}%>
    </p>
    <input type="button" name="regis" value="注册" class="register" onclick="window.location.href='register.jsp'">
    <input type="submit" name="signin" value="登录" class="denglu" >
  </form>
</div>
<div class="bq">
  Copyright © 2018 Yinvoker 版权归小隐所有
</div>
</body>
</html>
