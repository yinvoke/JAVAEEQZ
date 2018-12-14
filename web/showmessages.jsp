<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/29
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.hnu.yzw.model.OM" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/showmes.css">
</head>
<body>
    <table class="tablelist" border="1">
        <thead>
        <tr>
            <th>用户名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>qq</th>
            <th>工作</th>
            <th>工资</th>
            <th>住址</th>
            <th>房屋大小</th>
            <th>车型</th>
            <th>车价</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<OM> lo=(ArrayList<OM>)request.getAttribute("lo");
            for(OM o:lo){
        %>
        <tr>
            <td><%=o.getUname() %></td>
            <td><%=o.getUsex() %></td>
            <td><%=o.getUage()%></td>
            <td><%=o.getUqq() %></td>
            <td><%=o.getUwname() %></td>
            <td><%=o.getUwsalary() %></td>
            <td><%=o.getUhlocation() %></td>
            <td><%=o.getUhsize() %></td>
            <td><%=o.getUcname() %></td>
            <td><%=o.getUcprice() %></td>
        </tr>

        <%} %>
        </tbody>
    </table>
</body>
</html>
