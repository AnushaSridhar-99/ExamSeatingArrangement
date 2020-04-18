<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam Details</title>
<style>
	td,th{
		border: 1px solid black;
		padding: 10px;
	}
</style>
</head>
<body>
	<%
		String branch = request.getParameter("branch");
		branch="'"+branch+"'";
		int sem = Integer.parseInt(request.getParameter("sem"));
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

			Statement st=con.createStatement();
			String query="select * from examdetails where branchName="+branch+" AND semId="+sem;

			ResultSet rs=st.executeQuery(query);
			%>
				<table><% 
				if(rs!=null){
					while(rs.next()){
						%>
						<tr>
							<td>subject1</td>
							<td><%out.println(rs.getString("subject1")); %>
						</tr>
						<tr>
							<td>subject2</td>
							<td><%out.println(rs.getString("subject2")); %>
						</tr>
						<tr>
							<td>subject3</td>
							<td><%out.println(rs.getString("subject3")); %>
						</tr>
						<tr>
						<%
							if(rs.getString("subject4").equalsIgnoreCase("--")){
										
										} else {
						%>
						<td>subject4</td>
						<td>
							<%
								out.println(rs.getString("subject4"));
											}
							%>
						
					</tr>
						<tr>
						<%
							if(rs.getString("subject5").equalsIgnoreCase("--")){
										
										} else {
						%>
						<td>subject5</td>
						<td>
							<%
								out.println(rs.getString("subject5"));
											}
							%>
						
					</tr>
					<tr>
						<%
							if(rs.getString("subject6").equalsIgnoreCase("--")){
										
										} else {
						%>
						<td>subject6</td>
						<td>
							<%
								out.println(rs.getString("subject6"));
											}
							%>
						
					</tr>
					<%
			}
				}
		%>
				
					
				</table>
			<%
		}catch(Exception e){
			
		}
	%>
	<a href="StudentHomePage.jsp">Home Page</a>
</body>
</html>