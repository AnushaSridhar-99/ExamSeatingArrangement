<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notification</title>
	<style>
		.container{
			width:45%;
			height:auto;
			margin-left: 270px;
			margin-top: 30px;
			border: 1px solid black;
			padding: 20px;
		}
	</style>
</head>
<body>
<div class="container">
	<form action="AddNotification">
	<table>
			<tr>
				<th colspan="2" align="center">Add Notification</th>
			</tr>
			<tr>
				<td>Notification:</td>
				<td><textarea rows="4" cols="50" name="area"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Add"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>