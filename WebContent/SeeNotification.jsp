<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notification</title>
<style>
	td,th{
		border: 1px solid black;
		padding: 10px;
	}
</style>
</head>
<body>
<table>

		<tr>
			<td>NotificationId</td>
			<td>Notification</td>
			<td>Date</td>
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
			<td>
				<%
					out.println(rs.getInt("notificationId"));
				%>
			</td>
			<td>
				<%
					out.print(rs.getString("notification"));
				%>
			
			<td>
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
<a href="StudentHomePage.jsp">Home Page</a>

</body>
</html>