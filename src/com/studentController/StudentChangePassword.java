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
import com.model.Teacher;
import com.pojo.StudentDetails;
import com.pojo.TeacherDetails;

@WebServlet("/StudentChangePassword")
public class StudentChangePassword extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		int studentId = (Integer) session.getAttribute("studentId");
		System.out.println(studentId);
		String OldPassword = request.getParameter("oldPassword");
		String NewPassword = request.getParameter("newPassword");
		String ConfirmPassword = request.getParameter("confirmPassword");

		StudentDetails student = new StudentDetails();
		student.setId(studentId);
		System.out.println(OldPassword);

		Student studentDetails = new Student();
		List<StudentDetails> details = studentDetails.StudentDetails(student);
		System.out.println(details.isEmpty());

		String databasePassword = null;

		Iterator<StudentDetails> studentIterator = details.iterator();

		while (studentIterator.hasNext()) {
			StudentDetails databaseDetails = (StudentDetails) studentIterator.next();
			databasePassword = databaseDetails.getPassword();
		}
		if (OldPassword.equalsIgnoreCase(databasePassword)) {
			if (NewPassword.equalsIgnoreCase(ConfirmPassword)) {
				StudentDetails student1 = new StudentDetails();
				student1.setId(studentId);
				student1.setPassword(NewPassword);
				studentDetails.UpdatePassword(student1);
				
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Password updated');");
				out.println("location='StudentHomePage.jsp';");
				out.println("</script>");
			} else {
				PrintWriter out = response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Re-entered password is wrong');");
				out.println("location='StudentChangePassword.jsp';");
				out.println("</script>");
			}

		} else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Password is wrong');");
			out.println("location='StudentChangePassword.jsp';");
			out.println("</script>");
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
