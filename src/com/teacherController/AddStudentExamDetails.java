package com.teacherController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentExam;
import com.pojo.StudentExamDetails;
@WebServlet("/AddStudentExamDetails")
public class AddStudentExamDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String subject1 = request.getParameter("subject1");
		String subject2 = request.getParameter("subject2");		
		String subject3 = request.getParameter("subject3");
		String subject4 = request.getParameter("subject4");
		String subject5 = request.getParameter("subject5");
		String subject6 = request.getParameter("subject6");

		String subject7 = request.getParameter("subject7");
		String subject8 = request.getParameter("subject8");
		String subject9 = request.getParameter("subject9");
		String subject10 = request.getParameter("subject10");
		String branch =request.getParameter("branch");
		String sem=request.getParameter("sem");
		String studentName = request.getParameter("name");
		String usn = request.getParameter("usn");
		
		StudentExamDetails std1 =new StudentExamDetails();
		std1.setSubject1(subject1);
		std1.setSubject2(subject2);
		std1.setSubject3(subject3);
		std1.setSubject4(subject4);
		std1.setSubject5(subject5);
		std1.setSubject6(subject6);
		std1.setSubject7(subject7);
		std1.setSubject8(subject8);
		std1.setSubject9(subject9);
		std1.setSubject10(subject10);
		std1.setBranch(branch);
		std1.setSem(sem);
		std1.setStudentName(studentName);
		std1.setStudentUsn(usn);
		
		StudentExam stu=new StudentExam();
		boolean action=stu.AddNewStudent(std1);
		
		if(action==true) {
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Student exam details added');");
			out.println("location='AddStudentExamDetails.jsp';");
			out.println("</script>");
		}
		
		
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
