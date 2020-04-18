<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Subject</title>
<style>
.table2{
	border: 1px solid black;
	padding: 10px;
}
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
	<form action="Update">
		<table>
			<tr>
				<th colspan="2">Enter Subject details to be updated</th>
			</tr>
			<tr>
				<td><label>SubjectID: </label></td>
				<td><input type="text" name="subjectID"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</div>
	<br>
	<br>
	<%
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall", "root", "root");

			Statement st = con.createStatement();
			String query = "select * from subjectdetails";

			ResultSet rs = st.executeQuery(query);
	%>
	<table class="table2">
		<tr>
			<th class="table2">SubjectID</th>
			<th class="table2">Subject name</th>
			<th class="table2">Subject code</th>
			<th class="table2">Branch</th>
			<th class="table2">Semester</th>
		</tr>
		<%
			if (rs != null) {
					while (rs.next()) {
		%>
		<tr>
			<td class="table2">
				<%
					out.println(rs.getInt("id"));
				%>
			</td>
			<td class="table2">
				<%
					out.println(rs.getString("subjectname"));
				%>
			</td>
			<td class="table2">
				<%
					out.println(rs.getString("subjectcode"));
				%>
			</td>
			<td class="table2">
				<%
					out.println(rs.getString("branch"));
				%>
			</td>
			<td class="table2">
				<%
					out.println(rs.getString("sem"));
				%>
			</td>

		</tr>

		<%
			}
				}

			} catch (Exception e) {

			}
		%>
	</table>



</body>
</html>