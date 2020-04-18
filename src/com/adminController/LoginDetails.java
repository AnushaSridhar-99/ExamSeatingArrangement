package com.adminController;

import java.io.IOException;
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


@WebServlet("/login")

public class LoginDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("AdminId"));
	    String name=request.getParameter("AdminName");
	    String password=request.getParameter("AdminPassword");	
	    
	    TeacherDetails teacher= new TeacherDetails();
	    teacher.setId(id);
	    
	    Teacher teacherDetails = new Teacher();
		List<TeacherDetails> details = teacherDetails.TeacherDetails(teacher);
		
		String databaseName=null;
		String databasePassword=null;
		
		Iterator<TeacherDetails> teacherIterator = details.iterator();
		
		while(teacherIterator.hasNext()) {
			TeacherDetails databaseDetails=(TeacherDetails)teacherIterator.next();
			databaseName= databaseDetails.getName();
			databasePassword= databaseDetails.getPassword();
		}
		HttpSession session=request.getSession(true);
		session.setAttribute("teacherId", id);
		if(databaseName.equalsIgnoreCase(name) && databasePassword.equalsIgnoreCase(password)) {
			if(id==1) {
			response.sendRedirect("AdminHomePage.jsp");
			}
			else {		
				response.sendRedirect("TeacherHomePage.jsp");
			}
		}
		else {
			System.out.println("Error!");
		}
		
	}

	
	
}
