<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Seat Allotment</title>
<style>
	table,td,th{
		border: 1px solid black;
		padding: 10px;
	}
</style>
</head>
<body>
	<%
	String usn=request.getParameter("usn");
	usn="'"+usn+"'";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select * from classdetails where studentUsn="+usn;
		ResultSet rs=st.executeQuery(query);
		
		%>
	<table>
		<tr>
			<th>Date</th>
			<th>Class</th>
			<th>Bench</th>
			<th>Side</th>
			
		</tr>
		<%
			if (rs != null) {
					while (rs.next()) {
		%>
		<tr>
			<td>
				<%
					out.println(rs.getString("date"));
				%>
			</td>
			<td>
				<%
					out.println(rs.getString("classID"));
				%>
			</td>
			<td>
				<%
					out.println(rs.getInt("benchNumber"));
				%>
			</td>
			<td>
				<%
					if(rs.getInt("side")==0){
					out.println("A");
					}
					else{
						out.println("B");
					}
				%>
			</td>
			

		</tr>

		<%
				 
			}
		}

		}catch(Exception e){
			
		}
		
	%>
	</table>
	<a href="StudentHomePage.jsp">Home Page</a>
</body>
</html>