<%@ page import="com.hnu.yzw.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/27
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <script type="text/javascript">
        function quit(){
            var flag=window.confirm("你真的要退出吗?");
            if(flag){
                window.top.location.href="my?oper=out";
            }
        }
    </script>
</head>
<body bgcolor="#ffffe0">

    <a href="main.jsp" target="_parent" style="float: left"><img src="images/logo.png" alt="LOGO" width="65" height="65"></a>
    <font size="7"  style="float: left;">信息管理系统</font>
    <a a href="" onclick="quit()" style="float: right;padding-right: 20px;"><img src="images/exit.png" style="padding-top: 15px"></a>
    <span style="float: right;padding: 20px;padding-right: 40px;">欢迎，<%=((User)session.getAttribute("user")).getU_name()%>！</span>
</body>
</html>
