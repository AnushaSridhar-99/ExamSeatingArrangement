package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Subject;
import com.model.Teacher;
import com.pojo.SubjectDetails;
import com.pojo.TeacherDetails;

@WebServlet("/subject")
public class AddSubject extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subjectCode=request.getParameter("SubjectCode");
		String subjectName=request.getParameter("SubjectName");
		String branch=request.getParameter("branch");
		String sem=request.getParameter("semester");
		
		
		//System.out.println("Add Subject");
		
		SubjectDetails subjectDetails1 = new SubjectDetails();
		subjectDetails1.setSubjectcode(subjectCode);
		subjectDetails1.setSubjectname(subjectName);
		subjectDetails1.setBranch(branch);
		subjectDetails1.setSem(sem);

		Subject subject = new Subject();
		boolean action = subject.AddSubject(subjectDetails1);
		
		if(action == true) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Subject added');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
