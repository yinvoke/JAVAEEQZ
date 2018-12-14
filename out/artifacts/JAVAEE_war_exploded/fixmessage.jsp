<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/29
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="my" method="post">
    <input type="hidden" name="oper" value="bq">
    <table>
        <caption><big>基本信息</big></caption>
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>男<input type="radio" name="sexs" value="男">&nbsp;&nbsp;&nbsp;&nbsp;女<input type="radio" name="sexs" value="女"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="uage"></td>
        </tr>
        <tr>
            <td>qq号：</td>
            <td><input type="text" name="uqq"></td>
        </tr>
        <tr>
            <td>工作：</td>
            <td><input type="text" name="wname"></td>
        </tr>
        <tr>
            <td>工资：</td>
            <td><input type="text" name="wsalary"></td>
        </tr>
        <tr>
            <td>房子地址：</td>
            <td><input type="text" name="hlocation"></td>
        </tr>
        <tr>
            <td>房子大小：</td>
            <td><input type="text" name="hsize"></td>
        </tr>
        <tr>
            <td>车型：</td>
            <td><input type="text" name="cname"></td>
        </tr>
        <tr>
            <td>车价格：</td>
            <td><input type="text" name="cprice"></td>
        </tr>
        <tr>
            <td><input type="reset" value="重置"></td>
            <td><input type="submit" value="提交" style="float: right"></td>
        </tr>
    </table>
</form>
</body>
</html>
