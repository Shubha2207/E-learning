<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>

<style>

body{
 font-family: Arial, sans-serif;
}

  
  nav{
  	display:flex;
  	width:100%;
  }
  .navbar .nav{
 	padding:5px 35px; 
 	width:80%;	
  }
  header .nav a {
  	text-decoration: none;
  	color: white;
  }
  header button{
  	width:10%;
  	height:50%;
  	margin:25px 5px;
  }
  
  .button {
  background-color: none;
  border: 1px solid white;
  padding:5px;
  color: black;
  text-align: center;
  text-decoration: none;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}

.button:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}

.button2{
	background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}

a {
 text-decoration: none;
 color:white;
}


.button2:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}

.view{
  border: 1px solid gray;
  padding:5px;
  color: black;
  text-align: center;
  text-decoration: none;
  width:100%;
}
	
.view span{
  background-color: lightgray;
  border: 1px solid gray;
  border-radius: 5px;
  margin:5px;
  padding:5px;
  color: black;
  text-align: center;
  text-decoration: none;
  widht:100%;
}

footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;  
}

#courses td, #courses th {
  border: 1px solid #ddd;
  padding: 8px;
}

#courses tr:nth-child(even){background-color: #f2f2f2;}

#courses tr:hover {background-color: #ddd;}

#courses th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
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
			<button class="button">Logout</button>
		</nav>
		
	</header>
	<br>
	
	<div class="container">
	
		<div class="view">
				<span class="view-course">View Courses</span>
			<br>
			<br>
			<div>
				
				<table id="courses" style="with: 100%">
				<tr>
					<th>Course ID</th>
					<th>Course Name</th>
					<th>Description</th>
					<th>Fee</th>
					<th>Resources</th>
				</tr>
				<tr>
					<td>DSA_101</td>
					<td>Data Structure and Algorithm</td>
					<td>Data Structure and Algorithm</td>
					<td>1000/-</td>
					<td>https://google.com</td>
				</tr>

			</table>
			</div>
		</div>
		
	</div>
	
	<footer>
		<hr>
		<div>
			<div class="button2"> <a href="<%=request.getContextPath()%>/contact">Add Contact Details</a> </div>
			<div class="button2"> <a href="#">Give Feedback</a> </div>
		</div>
	</footer>

</body>
</html>