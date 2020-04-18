package com.studentController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Student;
import com.pojo.StudentDetails;

@WebServlet("/studentLogin")
public class StudentLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String name = request.getParameter("studentName");
		String password = request.getParameter("password");

		StudentDetails student = new StudentDetails();
		student.setName(name);

		Student studentDetails = new Student();
		List<StudentDetails> student1 = studentDetails.StudentDetails(student);
		System.out.println(student1.isEmpty());
		
		
		String databaseName = null;
		String databasePassword = null;
		int id=0;
		int verified=3;
		PrintWriter out = response.getWriter();
		Iterator<StudentDetails> studentIterator = student1.iterator();
		
		while (studentIterator.hasNext()) {
			StudentDetails databaseDetails = (StudentDetails) studentIterator.next();
			databaseName = databaseDetails.getName();
			databasePassword = databaseDetails.getPassword();
			id = databaseDetails.getId();
			verified = databaseDetails.getVerified();
		}

		if(verified==1) {
		HttpSession session=request.getSession(true);
		session.setAttribute("studentId", id);
		if (databaseName.equalsIgnoreCase(name) && databasePassword.equalsIgnoreCase(password)) {
			
			response.sendRedirect("StudentHomePage.jsp");
		} else {
			System.out.println("Error!");
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Username or password is wrong');");
			out.println("location='MainPage.jsp';");
			out.println("</script>");
		}
		}
		else if(verified==0) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Verification pending. Try again later');");
			out.println("location='MainPage.jsp';");
			out.println("</script>");
		}
		else if(verified==2) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration rejected');");
			out.println("location='MainPage.jsp';");
			out.println("</script>");
		}
		}


}
