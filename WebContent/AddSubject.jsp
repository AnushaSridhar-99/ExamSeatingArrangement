<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Subject</title>
<style>
	.container{
		width:30%;
		height:auto;
		margin-left: 350px;
		margin-top: 30px;
		border: 1px solid black;
		padding: 20px;
</style>
</head>
<body>
<div class="container">
	<form action="subject">
		<table>
			<tr>
				<th colspan="2" align="center" style="font-size: 20px;">
					<label>Enter Subject Details</label>
				</th>
			</tr>
			<tr align="right">
				<td><label>Enter Subject code: </label></td>
				<td><input type="text" name="SubjectCode"></td>
			</tr>	
			<tr align="right">
				<td><label>Enter subject Name: </label></td>
				<td><input type="text" name="SubjectName"></td>
			</tr>	
			<tr align="right">
				<td><label>Enter branch: </label></td>
				<td><input type="text" name="branch"></td>
			</tr>	
			<tr align="right">
				<td><label>Enter semester: </label></td>
				<td><input type="text" name="semester"></td>
			</tr>	
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Add">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>