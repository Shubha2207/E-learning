<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<style>
  .navbar .nav{
 	padding:5px 35px; 	
  }
  .nav a {
  	text-decoration: none;
  	color: white;
  }
</style>

</head>
<body>
	<header>
		<nav class="navbar" style="background-color: tomato">
			<div class="nav">
				<h2><a href="#" class="navbar-brand"> E-Learning App </a></h2>
			</div>

		</nav>
	</header>
	<br>
	<div align="center">
		<h1>User Login</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table style="with: 100%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="user_name" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="user_password" /></td>
				</tr>

			</table>
			
			<br>
			<input type="submit" value="Submit" />
		</form>
		<p>Haven't registered yet?? <a href="<%=request.getContextPath()%>/register">Create New Account!</a> </p>
	</div>

</body>
</html>