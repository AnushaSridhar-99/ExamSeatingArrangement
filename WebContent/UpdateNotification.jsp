<%@page import="javax.servlet.annotation.WebServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Notification</title>
</head>
<body>

 
 <%
  	/* String not1=request.getParameter("notid");
   	int not=Integer.parseInt(not1); */
   	int not = Integer.parseInt(request.getParameter("notid"));
  	//String notificationId=null;
  	String notification=null;
  	String date1=null;
  	int notificationid = 0;

  	try {
  		Class.forName("com.mysql.jdbc.Driver");
  		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall", "root", "root");

  		Statement st = con.createStatement();
  		String query = "select * from notificationdetails where notificationId=" + not;

  		ResultSet rs = st.executeQuery(query);
  		if (rs != null) {
  			while (rs.next()) {

  				notification = rs.getString("notification");
  				date1 = rs.getString("date1");

  				notificationid = rs.getInt("notificationId");
  			}
  		}

  	} catch (Exception e) {

  	}
  %>

	<form action="UpdateNotification">
		<table>
			<tr>
				<td>notification id</td>
				<td><input type="text" name="notificationId"
					value="<%out.println(notificationid);%>"></td>
			</tr>
			<tr>
				<td>notification</td>
				<td><textarea rows="4" cols="50" name="notification">
						<%
							out.println(notification);
						%>
					</textarea></td>
			</tr>
			<tr>
				<td>date</td>
				<td><input type="text" name="date"
					value="<%out.println(date1);%>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>

		</table>
	</form>

</body>
</html>