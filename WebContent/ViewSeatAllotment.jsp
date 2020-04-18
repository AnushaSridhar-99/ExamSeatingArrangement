<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Seat Allotment</title>
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
	<form action="DisplayAllotment.jsp">
		<table>
			<tr>
				<th colspan="2">Allotment details</th>
			</tr>
			<tr>
				<td>Enter class:</td>
				<td><input type="text" name="class"></td>
			</tr>
			<tr>
			<%	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select distinct date from classdetails";
		
		
		ResultSet rs=st.executeQuery(query);
		
		
		%>
				<td>Date</td>
				<td><select name="date">
						<option>------</option>
						<%
				if(rs!=null){
					while(rs.next()){
						%>
						<option>
							<%out.println(rs.getString("date")); %>
						</option>
						<%
							
								}

								}
						}catch(

							Exception e)
							{

							}
						%>
				</select>
			
			<tr>
				<td colspan="2" align="center"><input type="submit" value="View allotment"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>