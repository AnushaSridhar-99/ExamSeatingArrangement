<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
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
	<form action="change">
			<table>
				<tr>
					<th colspan="2">Change Password</th>
				</tr>
				<tr>
					<td align="right"><label>Enter old password: </label></td>
					<td><input type="password" name="Old"></td>
				<tr>
				<tr>
					<td align="right"><label>Enter new password: </label></td>
					<td><input type="password" name="New1"></td>
				</tr>
				<tr>
					<td align="right"><label>Confirm password: </label></td>
					<td><input type="password" name="New2"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Confirm"></td>
				</tr>
			</table>
		</form>
</div>
</body>
</html>