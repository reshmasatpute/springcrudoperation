<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String s=(String) request.getParameter("username");  %>
	<% List<String>msg=(List<String>) request.getAttribute("message"); %>
	<h1>This is INBOX.</h1>
	<h1><%=s%></h1> 
	<h1><%=msg %></h1>
</body>
</html>