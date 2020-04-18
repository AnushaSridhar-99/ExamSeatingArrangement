<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Login</title>
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
<body>
<div class="container">
	<form action="login">
		<table>
			<tr>
				<th colspan="2">Enter login details</th>
			</tr>
			<tr>
				<td>Teacher id</td>
				<td><input type="text" name="AdminId"></td>
			</tr>
			<tr>
				<td>Teacher name</td>
				<td><input type="text" name="AdminName"></td>
			</tr>
			<tr>
				<td>Teacher password</td>
				<td><input type="password" name="AdminPassword"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>