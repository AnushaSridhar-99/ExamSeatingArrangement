package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Notification;
import com.pojo.NotificationDetails;


@WebServlet("/UpdateNotification")
public class UpdateNotification extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 	String notification1=request.getParameter("notification");
		 	String notificationId1=request.getParameter("notificationId");
		 	int notificationid=Integer.parseInt(notificationId1);
		 	
		 	
			NotificationDetails  notificationdetails =new NotificationDetails();
			notificationdetails.setNotification(notification1);
			notificationdetails.setNotificationId(notificationid);
			
			Notification notify=new Notification();
			boolean action = notify.updateDetails(notificationdetails);
			if(action == true) {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Notification Updated');");
				out.println("location='AdminHomePage.jsp';");
				out.println("</script>");
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Failed to update Notification');");
				out.println("location='AdminHomePage.jsp';");
				out.println("</script>");
			}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
