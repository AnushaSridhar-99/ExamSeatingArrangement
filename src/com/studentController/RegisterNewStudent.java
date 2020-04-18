package com.studentController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.pojo.StudentDetails;

@WebServlet("/RegisterNewStudent")
public class RegisterNewStudent extends HttpServlet {
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("studentName");
		String studentUsn=request.getParameter("studentUsn");
		String phoneNumber=request.getParameter("studentPhoneNumber");
		String emailId=request.getParameter("studentEmailId");
		String aadharNo=request.getParameter("studentAadharNo");
		String password=request.getParameter("studentPassword");
		System.out.println(name);
		System.out.println(studentUsn);
		System.out.println(phoneNumber);
		System.out.println(emailId);
		System.out.println(aadharNo);
		System.out.println(password);
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setName(name);
		studentDetails.setUsn(studentUsn);
		studentDetails.setPhoneNumber(phoneNumber);
		studentDetails.setEmailId(emailId);
		studentDetails.setAadharNumber(aadharNo);
		studentDetails.setPassword(password);
		
		
		Student stu=new Student();
		boolean action=stu.RegisterNewStudent(studentDetails);
		
		if(action==true) {
			System.out.println("saved");
		}
	}




}
