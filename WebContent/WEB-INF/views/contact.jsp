<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact Details</title>
</head>
<body>
<div align="center">
  <h1>User Contact Details</h1>
  <form action="<%= request.getContextPath() %>/contact" method="post">
   <table style="with: 80%">
   	<tr>
     <td>Contact ID</td>
     <td><input type="text" name="contact_id" /></td>
    </tr>
    <tr>
     <td>User ID</td>
     <td><input type="text" name="user_id" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="first_name" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="last_name" /></td>
    </tr>
    <tr>
     <td>DOB</td>
     <td><input type="date" name="dob" /></td>
    </tr>
   </table>
   <br>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>