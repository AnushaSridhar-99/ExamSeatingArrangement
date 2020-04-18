package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Subject;
import com.pojo.SubjectDetails;

@WebServlet("/UpdateSubject")
public class UpdateSubjectDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String subjectName = request.getParameter("subjectname");
		String subjectcode = request.getParameter("subjectcode");
		String branch = request.getParameter("branch");
		String sem = request.getParameter("sem");
		
		SubjectDetails subject1 = new SubjectDetails();
		subject1.setId(id);
		subject1.setSubjectname(subjectName);
		subject1.setSubjectcode(subjectcode);
		subject1.setBranch(branch);
		subject1.setSem(sem);
		
		Subject subjectDetails = new Subject();
		boolean action = subjectDetails.UpdateSubject(subject1);
		if(action==true) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Subject Updated');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
		else {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Subject failed to update');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
