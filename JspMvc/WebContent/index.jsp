<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<style>
	.container{
		width:30%;
		border: 1px solid black;
		border-radius: 10px;
		padding: 20px;
		font-size: 20px;
		margin-left: auto;
		margin-right: auto;
		display: flex;
		flex-direction:column;
		justify-content: center;
		align-items: center;
	}
</style>
<body>
	<div class="container">
		<form action="ControllerServlet" method="post">
			NAME:<input type="text" name="name" placeholder="enter your name"><br><br> 
			EMAIL:<input type="email" name="email"placeholder="enter your email"><br><br> 
			PASSWORD:<input type="password" name="password"placeholder="enter your password"><br><br> 
				<input type="submit" value="Register">
		</form>
	</div>
</body>
</html>