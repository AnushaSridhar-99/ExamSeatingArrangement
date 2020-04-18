<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change password</title>
</head>
<body>
<h1>CHANGE PASSWORD</h1>
	<form action="StudentChangePassword">

	<table>
		<tr>
			<td>EnterOldPassword</td>
			<td><input type="password" name="oldPassword"></td>
		</tr>
		<tr>
			<td>EnterNewPassword</td>
			<td><input type="password" name="newPassword"></td>
		</tr>
		<tr>
			<td>ConfirmNewPassword</td>
			<td><input type="password" name="confirmPassword"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="submit"></td>
		</tr>
	</table>
</form>

</body>
</html>