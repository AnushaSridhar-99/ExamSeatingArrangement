package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Exam;
import com.pojo.ExamDetails;
@WebServlet("/AddExamDetails")
public class AddExamDetails extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String branch = request.getParameter("branch");
		System.out.println(branch);
		int branchID;
		if(branch.equalsIgnoreCase("CSE")) {
			branchID=1;
		}else {
			branchID=2;
		}
		String mat11 = request.getParameter("17mat11");
		String phy12 = request.getParameter("17phy12");
		String civ13 = request.getParameter("17civ13");
		String eme14 = request.getParameter("17eme14");
		String ele15 = request.getParameter("17ele15");
		int session1=Integer.parseInt(request.getParameter("session1"));
		ExamDetails sem1 = new ExamDetails();
		sem1.setBranchID(branchID);
		sem1.setSemId(1);
		sem1.setBranchName(branch);
		sem1.setSubject1(mat11);
		sem1.setSubject2(phy12);
		sem1.setSubject3(civ13);
		sem1.setSubject4(eme14);
		sem1.setSubject5(ele15);
		sem1.setSubject6("--");
		sem1.setSessionID(session1);
		
		Exam exam1 = new Exam();
		exam1.AddExam(sem1);
		
		String mat21 = request.getParameter("17MAT21");
		String che22 = request.getParameter("17CHE22");
		String pcd23 = request.getParameter("17PCD23");
		String eln25 = request.getParameter("17ELN25");
		String civ28 = request.getParameter("17CIV28");
		int session2=Integer.parseInt(request.getParameter("session2"));
		ExamDetails sem2=new ExamDetails();
		sem2.setSemId(2);
		sem2.setBranchID(branchID);
		sem2.setBranchName(branch);
		sem2.setSubject1(mat21);
		sem2.setSubject2(che22);
		sem2.setSubject3(pcd23);
		sem2.setSubject4(eln25);
		sem2.setSubject5(civ28);
		sem2.setSubject6("--");
		sem2.setSessionID(session2);
		
		Exam exam2= new Exam();
		exam2.AddExam(sem2);
		
		
		String mat31 = request.getParameter("17MAT31");
		String cs32 = request.getParameter("17CS32");
		String cs33 = request.getParameter("17CS33");
		String cs34 = request.getParameter("17CS34");
		String cs35 = request.getParameter("17CS35");
		String cs36 = request.getParameter("17CS36");
		int session3=Integer.parseInt(request.getParameter("session3"));
		ExamDetails sem3=new ExamDetails();
		sem3.setBranchID(branchID);
		sem3.setBranchName(branch);
		sem3.setSemId(3);
		sem3.setSubject1(mat31);
		sem3.setSubject2(cs32);
		sem3.setSubject3(cs33);
		sem3.setSubject4(cs34);
		sem3.setSubject5(cs35);
		sem3.setSubject6(cs36);
		sem3.setSessionID(session3);
		Exam exam3=new Exam();
		exam3.AddExam(sem3);
		
		
		String mat41 = request.getParameter("17MAT41");
		String cs42 = request.getParameter("17CS42");
		String cs43 = request.getParameter("17CS43");
		String cs44 = request.getParameter("17CS44");
		String cs45 = request.getParameter("17CS45");
		String cs46 = request.getParameter("17CS46");
		int session4=Integer.parseInt(request.getParameter("session4"));
		ExamDetails sem4=new ExamDetails();
		sem4.setBranchID(branchID);
		sem4.setBranchName(branch);
		sem4.setSemId(4);
		sem4.setSubject1(mat41);
		sem4.setSubject2(cs42);
		sem4.setSubject3(cs43);
		sem4.setSubject4(cs44);
		sem4.setSubject5(cs45);
		sem4.setSubject6(cs46);
		sem4.setSessionID(session4);
		Exam exam4=new Exam();
		exam4.AddExam(sem4);
		
		String cs51 = request.getParameter("17CS51");
		String cs52 = request.getParameter("17CS52");
		String cs53 = request.getParameter("17CS53");
		String cs54 = request.getParameter("17CS54");
		String cs55 = request.getParameter("17CS55*");
		String cs56 = request.getParameter("17CS56*");
		int session5=Integer.parseInt(request.getParameter("session5"));
		ExamDetails sem5=new ExamDetails();
		sem5.setBranchID(branchID);
		sem5.setBranchName(branch);
		sem5.setSemId(5);
		sem5.setSubject1(cs51);
		sem5.setSubject2(cs52);
		sem5.setSubject3(cs53);
		sem5.setSubject4(cs54);
		sem5.setSubject5(cs55);
		sem5.setSubject6(cs56);
		sem5.setSessionID(session5);
		Exam exam5=new Exam();
		exam5.AddExam(sem5);
	
		String cs61 = request.getParameter("17CS61");
		String cs62 = request.getParameter("17CS62");
		String cs63 = request.getParameter("17CS63");
		String cs64 = request.getParameter("17CS64");
		String cs65 = request.getParameter("17CS65*");
		String cs66 = request.getParameter("17CS66*");
		int session6=Integer.parseInt(request.getParameter("session6"));
		ExamDetails sem6 = new ExamDetails();
		sem6.setBranchID(branchID);
		sem6.setBranchName(branch);
		sem6.setSemId(6);
		sem6.setSubject1(cs61);
		sem6.setSubject2(cs62);
		sem6.setSubject3(cs63);
		sem6.setSubject4(cs64);
		sem6.setSubject5(cs65);
		sem6.setSubject6(cs66);
		sem6.setSessionID(session6);
		Exam exam6=new Exam();
		exam6.AddExam(sem6);
		
		
		String cs71 = request.getParameter("17CS71");
		String cs72 = request.getParameter("17CS72");
		String cs73 = request.getParameter("17CS73");
		String cs74 = request.getParameter("17CS74*");
		String cs75 = request.getParameter("17CS75*");
		int session7=Integer.parseInt(request.getParameter("session7"));
		ExamDetails sem7 = new ExamDetails();
		sem7.setBranchID(branchID);
		sem7.setBranchName(branch);
		sem7.setSemId(7);
		sem7.setSubject1(cs71);
		sem7.setSubject2(cs72);
		sem7.setSubject3(cs73);
		sem7.setSubject4(cs74);
		sem7.setSubject5(cs75);
		sem7.setSubject6("--");
		sem7.setSessionID(session7);
		Exam exam7=new Exam();
		exam7.AddExam(sem7);
		
		String cs81 = request.getParameter("17CS81");
		String cs82 = request.getParameter("17CS82");
		String cs83 = request.getParameter("17CS83*");
		int session8=Integer.parseInt(request.getParameter("session8"));
		ExamDetails sem8 = new ExamDetails();
		sem8.setBranchID(branchID);
		sem8.setBranchName(branch);
		sem8.setSemId(8);
		sem8.setSubject1(cs81);
		sem8.setSubject2(cs82);
		sem8.setSubject3(cs83);
		sem8.setSubject4("--");
		sem8.setSubject5("--");
		sem8.setSubject6("--");
		sem8.setSessionID(session8);
		Exam exam8=new Exam();
		exam8.AddExam(sem8);
		
		PrintWriter out = response.getWriter();
		out.println("<script type=\"text/javascript\">");
		   out.println("alert('Exam details added');");
		   out.println("location='AdminHomePage.jsp';");
		   out.println("</script>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
