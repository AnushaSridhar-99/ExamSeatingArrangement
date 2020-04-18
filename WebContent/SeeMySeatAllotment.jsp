<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Seat Allotment</title>
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
	<form action="MySeatAllotment.jsp">
		<table>
			<tr>
				<th colspan="2">Enter details</th>
			</tr>
			<tr>
				<td>Enter Usn:</td>
				<td><input type="text" name="usn"></td>
			</tr> 
			<tr>
				<td colspan="2" align="center"><input type="submit" value="View"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>