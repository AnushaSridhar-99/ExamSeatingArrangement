package com.adminController;

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

import com.model.Teacher;
import com.pojo.TeacherDetails;

@WebServlet("/change")
public class ChangePassword extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		int teacherId = (Integer) session.getAttribute("teacherId");

		String OldPassword = request.getParameter("Old");
		String NewPassword = request.getParameter("New1");
		String ConfirmPassword = request.getParameter("New2");

		TeacherDetails teacher = new TeacherDetails();
		teacher.setId(teacherId);

		Teacher teacherDetails = new Teacher();
		List<TeacherDetails> details = teacherDetails.TeacherDetails(teacher);
		System.out.println(details.isEmpty());

		String databasePassword = null;

		Iterator<TeacherDetails> teacherIterator = details.iterator();
		PrintWriter out = response.getWriter();

		while (teacherIterator.hasNext()) {
			TeacherDetails databaseDetails = (TeacherDetails) teacherIterator.next();
			databasePassword = databaseDetails.getPassword();
		}
		if (OldPassword.equalsIgnoreCase(databasePassword)) {
			if (NewPassword.equalsIgnoreCase(ConfirmPassword)) {
				TeacherDetails teacher1 = new TeacherDetails();
				teacher1.setId(teacherId);
				teacher1.setPassword(NewPassword);
				teacherDetails.UpdatePassword(teacher1);
				if (teacherId == 1) {

					out.println("<script type=\"text/javascript\">");
					out.println("alert('Password changed');");
					out.println("location='AdminHomePage.jsp';");
					out.println("</script>");
				} else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Password changed');");
					out.println("location='TeacherHomePage.jsp';");
					out.println("</script>");
				}

			} else {

					out.println("<script type=\"text/javascript\">");
					out.println("alert('Re-entered password is wrong');");
					out.println("location='ChangePassword.jsp';");
					out.println("</script>");	
			}

		} else {

			out.println("<script type=\"text/javascript\">");
			out.println("alert('Wrong Password');");
			out.println("location='ChangePassword.jsp';");
			out.println("</script>");	
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
