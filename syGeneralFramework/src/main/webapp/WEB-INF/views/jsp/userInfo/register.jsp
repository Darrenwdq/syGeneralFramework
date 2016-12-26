<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/usr.css"></link>
<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
<script type="text/javascript" src="js/usr.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form action="verificationRegister.do" method="post" onsubmit="return check()">
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="username" name="username"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input type="password" id="confirmPassword" name="confirmPassword"></td>
			</tr>
			<tr>
				<td>email：</td>
				<td><input type="text" id="email" name="email"></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" id="tel" name="tel"></td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" id="phone" name="phone"></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"></td>
				<td><input type="button" value="取消"></td>
			</tr>
		</table>
	</form>
</body>
</html>