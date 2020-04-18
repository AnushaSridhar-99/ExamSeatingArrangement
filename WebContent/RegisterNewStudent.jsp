<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<H1>REGISTER NEW STUDENT</H1>
 <form action="RegisterNewStudent">

	<table>
		<tr>
			<td>Name</td>
			<td><input type="text" name="studentName"></td>
		</tr>
		<tr>
			<td>USN</td>
			<td><input type="text" name="studentUsn"></td>
		</tr>
		<tr>
			<td>PhoneNumber</td>
			<td><input type="text" name="studentPhoneNumber"></td>
		</tr>
		<tr>
			<td>Email_id</td>
			<td><input type="text" name="studentEmailId"></td>
		</tr>
		<tr>
			<td>AadharNo</td>
			<td><input type="text" name="studentAadharNo"></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="password" name="studentPassword"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>