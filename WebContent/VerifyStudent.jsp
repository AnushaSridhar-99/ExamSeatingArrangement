<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verify Student</title>
</head>
<body>
	<% 
	
	String aadharNumber=null;
	String name=null;
	String emailId=null;
	String password=null;
	String phoneNumber=null;
	String usn=null;
	int id=0;
	
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select * from studentdetails where verified=0";

		ResultSet rs=st.executeQuery(query);
		if(rs!=null) {
			while(rs.next()) {	
				aadharNumber=rs.getString("aadharNumber");
				name=rs.getString("name");
				emailId=rs.getString("emailId");
				password=rs.getString("password");
				phoneNumber=rs.getString("phoneNumber");
				usn=rs.getString("usn");
				id=rs.getInt("id");
			}
		}

		}catch(Exception e){
			
		}
	%>
	
	<form action="StudentValidation">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="<%out.println(id);%>"></td>
			</tr>
			<tr>
				<td>aadhar number</td>
				<td><input type="text" name="aadharNumber"
					value="<%out.println(aadharNumber);%>"></td>
			</tr>
			<tr>
				<td>emailId</td>
				<td><input type="text" name="emailId"
					value="<%out.println(emailId);%>"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name"
					value="<%out.println(name);%>"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password"
					value="<%out.println(password);%>"></td>
			</tr>
			<tr>
				<td>phone Number</td>
				<td><input type="text" name="phoneNumber"
					value="<%out.println(phoneNumber);%>"></td>
			</tr>
			<tr>
				<td>usn</td>
				<td><input type="text" name="usn" value="<%out.println(usn);%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="accept" name="action"><input type="submit"
					value="reject" name="action"></td>
			</tr>
		</table>
	</form>
</body>
</html>