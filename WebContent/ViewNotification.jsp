<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Notification</title>
<style>
	.table2{
	border: 1px solid black;
	padding: 10px;
}
</style>
</head>
<body>
	<table>

		<tr>
			<th class="table2">NotificationId</th>
			<th class="table2">Notification</th>
			<th class="table2">Date</th>
		<tr>

			<%
				try {
					Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall", "root", "root");

					Statement st = con.createStatement();

					//String query="insert into students(name) values("+s+")";

					String query = "select * from notificationdetails";

					//int i=st.executeUpdate(query);

					ResultSet rs = st.executeQuery(query);

					//List ls=st.executeQuery(query);
					//PrintWriter pw=response.getWriter();
					if (rs != null) {
						while (rs.next()) {
			%>
		
		<tr>
			<td class="table2">
				<%
					out.println(rs.getInt("notificationId"));
				%>
			</td>
			<td class="table2">
				<%
					out.print(rs.getString("notification"));
				%>
			
			<td class="table2">
				<%
					out.print(rs.getString("date1"));
				%>
			</td>
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
	
<a href="TeacherHomePage.jsp">Home Page</a>
</body>
</html>