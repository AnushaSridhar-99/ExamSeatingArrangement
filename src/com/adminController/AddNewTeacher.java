package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Teacher;
import com.pojo.TeacherDetails;

@WebServlet("/addTeacher")
public class AddNewTeacher extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String teacherName=request.getParameter("TeacherName"); String
		  PhoneNumber=request.getParameter("PhoneNumber"); String
		  Password=request.getParameter("Password"); 
		 
		System.out.println(teacherName);
		System.out.println(PhoneNumber);
		System.out.println(Password);
		
		TeacherDetails teacherDetails1 = new TeacherDetails();
		teacherDetails1.setName(teacherName);
		teacherDetails1.setPhoneNumber(PhoneNumber);
		teacherDetails1.setPassword(Password);
		
		Teacher teacher = new Teacher();
		boolean action = teacher.registerTeacher(teacherDetails1);
		
		if(action == true) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('New Teacher Added');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Failed to add teacher');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
