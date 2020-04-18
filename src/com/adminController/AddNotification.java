package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Notification;
import com.pojo.NotificationDetails;


@WebServlet("/AddNotification")
public class AddNotification extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		
		
		String currentDateAndTime=dateFormat.format(date);
		
		String area1=request.getParameter("area");
		
		System.out.println(area1);
		
		NotificationDetails notification=new NotificationDetails();
		notification.setNotification(area1);
		notification.setDate1(currentDateAndTime);
		System.out.println(area1);
		Notification notification1=new Notification();
		boolean action = notification1.AddNotification(notification);
		if(action == true) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Notification Added');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Failed to add Notification');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
