<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam Details</title>
<style>
	.container{
		width:30%;
		height:auto;
		margin-left: 350px;
		margin-top: 30px;
		border: 1px solid black;
		padding-left:20px;
		padding-bottom:20px;
	}
</style>
</head>
<body>
	<div class="container">
		<p>Select Branch</p>
		<form action="AddExamDetailsCSE.jsp">
			<input type="submit" value="Computer Science and Engineering"
				name="CSE">
		</form>
		<form action="AddExamDetailsECE.jsp">
			<input type="submit"
				value="Electronics and Communucation Engineering" name="ECE">
		</form>
	</div>
</body>
</html>