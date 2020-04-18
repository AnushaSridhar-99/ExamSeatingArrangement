package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.pojo.StudentDetails;

@WebServlet("/StudentValidation")
public class StudentValidation extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String studentUsn=request.getParameter("usn");
		String phoneNumber=request.getParameter("phoneNumber");
		String emailId=request.getParameter("emailId");
		String aadharNo=request.getParameter("aadharNumber");
		String password=request.getParameter("password");
		String action = request.getParameter("action");
		System.out.println(action);
		
		System.out.println(name);
		System.out.println(studentUsn);
		System.out.println(phoneNumber);
		System.out.println(emailId);
		System.out.println(aadharNo);
		System.out.println(password);
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setId(id);
		if(action.equalsIgnoreCase("accept")) {
			studentDetails.setVerified(1);
		}
		else {
			studentDetails.setVerified(2);
		}
		
		Student student = new Student();
		boolean a = student.updateStudent(studentDetails);
		if(a==true) {
			System.out.println("Updated");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Student verified');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Student application rejected');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		
	}
}
