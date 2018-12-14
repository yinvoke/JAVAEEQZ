<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/29
  Time: 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script>
        function yanzheng() {
            var password = document.getElementById("mm").value;
            var repassword = document.getElementById("rmm").value;
            if(password!=repassword){
                document.getElementById("rmm").value="";
                window.alert("您输入的新密码与确认密码确认不一致");
                xiugai.rmm.focus();
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <form id="xiugai" action="my" method="post">
        <table>
            <caption style="font-size: 23px"><b>修改密码</b></caption>
            <input type="hidden" value="pwd" name="oper">
            <tr>
                <td>旧密码：</td>
                <td><input type="password" name="oldPwd"></td>
            </tr>
            <tr>
                <td>新密码：</td>
                <td><input type="password" name="newPwd" id="mm"></td>
            </tr>
            <tr>
                <td>再次输入新密码：</td>
                <td><input type="password" name="rnewPwd" id="rmm" onchange="yanzheng()"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <%
                        Object o = request.getAttribute("fixflag");
                        if(o!=null){
                    %>
                    <br><span style="color: red">旧密码输入错误</span>
                    <%}%>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="修改" width="600px"></td>
            </tr>
        </table>
    </form>
</body>
</html>
