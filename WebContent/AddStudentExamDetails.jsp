<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student Exam Details</title>
</head>
<body>

   <form action="AddStudentExamDetails">
   <h1>STUDENTS EXAM DETAILS</h1>
   <table>
			<tr>
				<td><label>Enter Student usn:</label></td>
				<td><input type="text" name="usn"></td>
			</tr>
			<tr>
				<td><label>Enter Student name:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
		<%	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

		Statement st=con.createStatement();
		String query="select subjectcode from subjectdetails";
		
		for(int i=1;i<=10;i++){
		ResultSet rs=st.executeQuery(query);
		String s="subject";
		s=s+i;
		
		%>
		
		<tr><td>Subject <%out.println(i); %>:</td>
		<td>
		<select name="<%=s%>">
			<option>------</option>
			<%
				if(rs!=null){
					while(rs.next()){
						%>
							<option><%out.println(rs.getString("subjectcode")); %></option>
						<% 
					}
				}

		}
}catch(Exception e){
			
		}
		%>
			
		</select></td>
		</tr>
			<%
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

				Statement st=con.createStatement();
				String query="select distinct branch from subjectdetails";

				ResultSet rs=st.executeQuery(query);
				%>
				
			<tr><td>Branch:</td>
				<td>
		
				
				<select name="branch">
					<option>------</option>
					<%
						if(rs!=null){
							while(rs.next()){
								%>
									<option><%out.println(rs.getString("branch")); %></option>
								<% 
							}
						}
					%>
					
				</select></td>
				<%
				}catch(Exception e){
					
				}
				
			%>
		</tr>
		<%
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall","root","root");

				Statement st=con.createStatement();
				String query="select distinct sem from subjectdetails";

				ResultSet rs=st.executeQuery(query);
				%>
				
			<tr><td>Sem:</td>
				<td>
		
				
				<select name="sem">
					<option>------</option>
					<%
						if(rs!=null){
							while(rs.next()){
								%>
									<option><%out.println(rs.getString("sem")); %></option>
								<% 
							}
						}
					%>
					
				</select></td>
				<%
				}catch(Exception e){
					
				}
				
			%>
		</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

		</table>
   
   </form>
<a href="TeacherHomePage.jsp">Home Page</a>
</body>
</html>