<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/27
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.hnu.yzw.model.User" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body bgcolor="#f0fff0">
	<h2>目录</h2>
    <ul>
        <h4>个人信息</h4>
        <ul>
            <h5><a href="my?oper=mine" target="rightFrame">查看个人信息</a></h5>
            <h5><a href="fixmessage.jsp" target="rightFrame">设置个人信息</a></h5>
            <h5><a href="fixpwd.jsp" target="rightFrame">修改密码</a></h5>
        </ul>
        <%
            String uname = ((User)session.getAttribute("user")).getU_name();
            if(uname.equals("admin")){%>
        <h4>管理信息</h4>
        <ul>
            <h5><a href="my?oper=show" target="rightFrame">用户信息</a></h5>
        </ul>
            <%}
        %>

    </ul>
</body>
</html>
 