<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
	<h1>Register page</h1>
	<form action="./register" method="post">
	<input type="text" name="username" placeholder="type username"> <br> <br>
	<input type="email"name="email" placeholder="Type your email"> <br> <br>
	<input type="password"name="password" placeholder="suggest strong password"> <br> <br>
	<input type="password" name="retype_password" placeholder="confirm password"> <br> <br>
	<input type="submit"value="SUBMIT">
	
	</form>
</body>
</html>