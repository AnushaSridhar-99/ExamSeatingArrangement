<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update subject</title>
</head>
<body>
	<%
	String subjectcode=null;
	String subjectname=null;
	String branch=null;
	String sem=null;
	int id = (Integer)session.getAttribute("subjectId");
	System.out.println(id);
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select * from subjectdetails where id="+id;
		
		ResultSet rs=st.executeQuery(query);
		
		
		if(rs!=null) {
			while(rs.next()) {	
				subjectcode=rs.getString("subjectcode");
				subjectname=rs.getString("subjectname");
				branch=rs.getString("branch");
				sem=rs.getString("sem");
			}
		}
		}catch(Exception e){
			
		} 
	%>
	<form action="UpdateSubject">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="<%out.println(id);%>"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>subject name</td>
				<td><input type="text" name="subjectname"
					value="<%out.println(subjectname);%>"></td>
			</tr>
			<tr>
				<td>subject code</td>
				<td><input type="text" name="subjectcode"
					value="<%out.println(subjectcode);%>"></td>
			</tr>
			<tr>
				<td>branch</td>
				<td><input type="text" name="branch"
					value="<%out.println(branch);%>"></td>
			</tr>
			<tr>
				<td>sem</td>
				<td><input type="text" name="sem" value="<%out.println(sem);%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="update"></td>
			</tr>
		</table>
	</form>
</body>
</html>