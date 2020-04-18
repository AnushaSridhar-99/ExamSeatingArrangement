<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>
	<form action="studentLogin">
		<table>
			<tr>
				<th colspan="2">Enter login details</th>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name = "studentName"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name = "password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>