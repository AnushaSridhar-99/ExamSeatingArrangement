<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Registration</title>
<style>
		.container{
		width:30%;
		height:auto;
		margin-left: 350px;
		margin-top: 30px;
		border: 1px solid black;
		padding: 20px;
	}
	</style>
</head>
<body>
<div class="container">
	<form action="addTeacher">
		<table>
			<tr>
				<th colspan="2" align="center">Enter teacher details</th>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="TeacherName"></td>
			</tr>
			<tr>
				<td><label>Phone Number</label></td>
				<td><input type="text" name="PhoneNumber"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="text" name="Password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</div>
	
</body>
</html>