<%@ page import="com.hnu.Message" %><%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/12/14
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <p>欢迎，<%=((Message)session.getAttribute("me")).getName()%>!</p>
    <p>您今年<%=((Message)session.getAttribute("me")).getAge()%>岁了！</p>
    <p>
        您邮箱为<%=((Message)session.getAttribute("me")).getAge()%>！
        <%
            if(((Message)session.getAttribute("me")).yanzheng()){
                %>验证通过！<%
            }else{
                %>验证未通过！<%
            }
        %>
    </p>
</body>
</html>
