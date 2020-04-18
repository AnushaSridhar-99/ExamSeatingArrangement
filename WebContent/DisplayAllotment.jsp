<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seat Allotment</title>
	<style>
		.table1{
			float: left;	
		}
		.table{
			width: 30%;
			float: right;
		}
		td,th{
		border: 1px solid black;
		padding: 10px;
	}
	</style>
</head>
<body>
<table class="table1">
<tr>
	<th>CSE</th>
	
</tr>

	<% 

	
		try{
			int classID = Integer.parseInt(request.getParameter("class"));
			String date = request.getParameter("date");
			date="'"+date+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select studentUsn from classdetails where side=0 AND date="+date+" AND classID="+classID;
		
		ResultSet rs=st.executeQuery(query);
	
		if(rs!=null) {
			while(rs.next()) {	
				%>
					<tr>
						<td><% 
						if(rs.getString("studentUsn").isEmpty()){
							
						}else{
						out.println(rs.getString("studentUsn"));} %></td>
						
						
					</tr>
				<%
			}
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		%>
	</table>
	<table class="table2">
<tr>
	<th>ECE</th>
	
</tr>

	<% 

	
		try{
			int classID = Integer.parseInt(request.getParameter("class"));
			String date = request.getParameter("date");
			date="'"+date+"'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select studentUsn from classdetails where side=1 AND date="+date+" AND classID="+classID;
		
		ResultSet rs=st.executeQuery(query);
		if(rs!=null) {
			while(rs.next()) {	
				%>
					<tr>
						<td><% 
						if(rs.getString("studentUsn").isEmpty()){
							
						}else{
						out.println(rs.getString("studentUsn"));} %></td>
						
						
					</tr>
				<%
			}
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		%>
		
		
	</table> 
	<a href="AdminHomePage.jsp">Home Page</a>
</body>
</html>