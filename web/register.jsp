<%--
  Created by IntelliJ IDEA.
  User: Invoker
  Date: 2018/11/27
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>注册</title>
    <meta charset="utf-8">
	<meta name="author" content="Yinvoker">
	<link rel="stylesheet" type="text/css" href="css/reg.css">
	<script>
		function yanzheng() {
			var password = document.getElementById("mm").value;
			var repassword = document.getElementById("rmm").value;
            if(password!=repassword){
                document.getElementById("rmm").value="";
                window.alert("您输入的新密码与确认密码确认不一致");
                zhuce.rmm.focus();
                return false;
            }
            return true;
        }
	</script>
</head>
<body>
    <div  class="main">
		<form action="my" method="post" id="zhuce">
			<input type="hidden" name="oper" value="reg" />
			<div class="head"><h1 class="zi">注册</h1></div>
			<p class="zi1">User name<br>
			<input type="text" name="uname" placeholder="输入用户名" class="input"><br></p>
			<p class="zi1">Password<br>
			<input type="password" name="pwd" placeholder="输入密码" class="input" id="mm"></p>
			<p class="zi1">RePassword<br>
			<input type="password" name="rpwd" placeholder="确认密码" class="input" id="rmm" onchange="yanzheng()"></p>
			<input type="submit" name="regis" value="注册" class="denglu">
		</form>
	</div>
	<div class="bq">
		Copyright © 2018 Yinvoker 版权归小隐所有
	</div>
</body>
</html>