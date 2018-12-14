<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/27
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.hnu.yzw.model.User" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
</head>
<body>

    <b>欢迎使用信息管理系统</b><br>
    <%HttpSession hs = request.getSession();
        //获取请求信息
        int id = ((User)request.getSession().getAttribute("user")).getU_id();%>
    当前用户id ：<%=id%>
</body>

</html>
