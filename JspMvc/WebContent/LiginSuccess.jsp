<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="userFormJspMvc.LoginBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successfully</title>
</head>
<body>
	<h1>You have logged in successfully</h1>
	<%
	LoginBean bean=(LoginBean)request.getAttribute("bean");
	out.println("<h3>welcome, "+bean.getName()+"</h3>");
	%>
</body>
</html>