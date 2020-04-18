package com.adminController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Class1;
import com.pojo.ClassDetails;


@WebServlet("/allot")
public class MakeAllotment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamHall", "root", "root");

			String sql = "drop table classdetails";
			Statement state = con.createStatement();
			state.executeUpdate(sql);

			int Class = 1;
			int side = 0;
			int bench = 1;

			for (int i = 1; i <= 5; i++) { 
				Class = 1;
				bench = 1;
				String s = "subject";
				String si = s + i;
				Statement st = con.createStatement();
				String query = "select " + si + ",sessionID from examdetails where branchName='CSE' and semId=1";

				ResultSet rs = st.executeQuery(query);
				if (rs != null) {
					while (rs.next()) {
						System.out.println(rs.getString(si));
						String date = rs.getString(si);
						System.out.println(rs.getInt("sessionID"));
						int sessionId = rs.getInt("sessionID");
						Statement st2 = con.createStatement();
						String query2 = "select subjectcode from subjectdetails where branch='CSE' AND sem=1 AND subjectID="
								+ i;
						ResultSet rs2 = st2.executeQuery(query2);

						if (rs2 != null) {
							while (rs2.next()) {
								System.out.println(rs2.getString("subjectcode"));
								String subjectcode = rs2.getString("subjectcode");
								subjectcode = "'" + subjectcode + "'";
								Statement st3 = con.createStatement();
								String query3 = "select studentUsn from studentexamdetails where branch='CSE' and (subject1="
										+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
										+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode
										+ " OR subject6=" + subjectcode + " OR subject7=" + subjectcode
										+ " OR subject8=" + subjectcode + " OR subject9=" + subjectcode
										+ " OR subject10=" + subjectcode + ")";
								ResultSet rs3 = st3.executeQuery(query3);

								if (rs3 != null) {

									while (rs3.next()) {

										System.out.println(rs3.getString("studentUsn"));
										ClassDetails classdetails = new ClassDetails();
										classdetails.setBenchNumber(bench);
										classdetails.setClassID(Class);
										classdetails.setDate(date);
										classdetails.setSessionId(sessionId);
										classdetails.setSide(side);
										classdetails.setStudentUsn(rs3.getString("studentUsn"));

										Class1 class1 = new Class1();
										class1.AddClass(classdetails);

										if (bench == 15) {
											bench = 1;
											Class++;
										} else {
											bench++;
										}
									}
								}
							}
						}
					}
				}
			}
			for (int j = 3; j <= 5; j += 2) {
				bench = 1;
				Class = 1;
				for (int i = 1; i <= 6; i++) {
					String s = "subject";
					String si = s + i;
					Statement st = con.createStatement();
					String query = "select " + si + ",sessionID from examdetails where branchName='CSE' and semId=" + j;

					ResultSet rs = st.executeQuery(query);
					if (rs != null) {
						while (rs.next()) {
							System.out.println(rs.getString(si));
							String date = rs.getString(si);
							String date1 = "'"+date+"'";
							int sessionId = rs.getInt("sessionID");
							Statement st4 = con.createStatement();
							String query4 = "select benchNumber, classID from classdetails where date=" + date1
									+ " AND side=0";
							ResultSet rs4 = st4.executeQuery(query4);

							if (rs4 != null) {
								while (rs4.next()) {
									bench = rs4.getInt("benchNumber");
									Class = rs4.getInt("classID");
								}
								if (bench == 15) {
									bench = 1;
									Class++;
								} else {
									bench++;
								}
							}

							Statement st2 = con.createStatement();
							String query2 = "select subjectcode from subjectdetails where branch='CSE' AND sem=" + j
									+ " AND subjectID= " +i;
							ResultSet rs2 = st2.executeQuery(query2);

							if (rs2 != null) {
								while (rs2.next()) {
									System.out.println(rs2.getString("subjectcode"));
									String subjectcode = rs2.getString("subjectcode");
									subjectcode = "'" + subjectcode + "'";
									Statement st3 = con.createStatement();
									String query3 = "select studentUsn from studentexamdetails where branch='CSE' and (subject1="
											+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
											+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode + " OR subject6="
											+ subjectcode + " OR subject7=" + subjectcode + " OR subject8=" + subjectcode
											+ " OR subject9=" + subjectcode + " OR subject10=" + subjectcode + ")";
									ResultSet rs3 = st3.executeQuery(query3);

									if (rs3 != null) {
										while (rs3.next()) {
											System.out.println(rs3.getString("studentUsn"));
											ClassDetails classdetails = new ClassDetails();
											classdetails.setBenchNumber(bench);
											classdetails.setClassID(Class);
											classdetails.setDate(date);
											classdetails.setSessionId(sessionId);
											classdetails.setSide(side);
											classdetails.setStudentUsn(rs3.getString("studentUsn"));
											
											Class1 class1 = new Class1();
											class1.AddClass(classdetails);
											
											if(bench==15) {
												bench=1;
												Class++;
											}
											else {
												bench++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			for (int i = 1; i <= 5; i++) { 
				Class = 1;
				bench = 1;
				String s = "subject";
				String si = s + i;
				Statement st = con.createStatement();
				String query = "select " + si + ",sessionID from examdetails where branchName='CSE' and semId=7";

				ResultSet rs = st.executeQuery(query);
				if (rs != null) {
					while (rs.next()) {
						System.out.println(rs.getString(si));
						String date = rs.getString(si);
						System.out.println(rs.getInt("sessionID"));
						int sessionId = rs.getInt("sessionID");
						Statement st2 = con.createStatement();
						String query2 = "select subjectcode from subjectdetails where branch='CSE' AND sem=7 AND subjectID="+i;
						ResultSet rs2 = st2.executeQuery(query2);

						if (rs2 != null) {
							while (rs2.next()) {
								System.out.println(rs2.getString("subjectcode"));
								String subjectcode = rs2.getString("subjectcode");
								subjectcode = "'" + subjectcode + "'";
								Statement st3 = con.createStatement();
								String query3 = "select studentUsn from studentexamdetails where branch='CSE' and (subject1="
										+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
										+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode
										+ " OR subject6=" + subjectcode + " OR subject7=" + subjectcode
										+ " OR subject8=" + subjectcode + " OR subject9=" + subjectcode
										+ " OR subject10=" + subjectcode + ")";
								ResultSet rs3 = st3.executeQuery(query3);

								if (rs3 != null) {

									while (rs3.next()) {

										System.out.println(rs3.getString("studentUsn"));
										ClassDetails classdetails = new ClassDetails();
										classdetails.setBenchNumber(bench);
										classdetails.setClassID(Class);
										classdetails.setDate(date);
										classdetails.setSessionId(sessionId);
										classdetails.setSide(side);
										classdetails.setStudentUsn(rs3.getString("studentUsn"));

										Class1 class1 = new Class1();
										class1.AddClass(classdetails);

										if (bench == 15) {
											bench = 1;
											Class++;
										} else {
											bench++;
										}
									}
								}
							}
						}
					}
				}
			}
			Class=1;
			side=1;
			bench=1;
			
			for (int i = 1; i <= 5; i++) {
				Class=1;
				bench=1;
				String s = "subject";
				String si = s + i;
				Statement st = con.createStatement();
				String query = "select " + si + ",sessionID from examdetails where branchName='ECE' and semId=1";
				
				ResultSet rs = st.executeQuery(query);
				if (rs != null) {
					while (rs.next()) {
						System.out.println(rs.getString(si));
						String date = rs.getString(si);
						System.out.println(rs.getInt("sessionID"));
						int sessionId = rs.getInt("sessionID");
						Statement st2 = con.createStatement();
						String query2 = "select subjectcode from subjectdetails where branch='ECE' AND sem=1 AND subjectID="
								+ i;
						ResultSet rs2 = st2.executeQuery(query2);
						
						if (rs2 != null) {
							while (rs2.next()) {
								System.out.println(rs2.getString("subjectcode"));
								String subjectcode = rs2.getString("subjectcode");
								subjectcode="'"+subjectcode+"'";
								Statement st3 = con.createStatement();
								String query3 = "select studentUsn from studentexamdetails where branch='ECE' and (subject1="
										+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
										+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode + " OR subject6="
										+ subjectcode + " OR subject7=" + subjectcode + " OR subject8=" + subjectcode
										+ " OR subject9=" + subjectcode + " OR subject10=" + subjectcode + ")";
								ResultSet rs3 = st3.executeQuery(query3);

								if (rs3 != null) {
									
									while (rs3.next()) {
										
										System.out.println(rs3.getString("studentUsn"));
										ClassDetails classdetails = new ClassDetails();
										classdetails.setBenchNumber(bench);
										classdetails.setClassID(Class);
										classdetails.setDate(date);
										classdetails.setSessionId(sessionId);
										classdetails.setSide(side);
										classdetails.setStudentUsn(rs3.getString("studentUsn"));
										
										Class1 class1 = new Class1();
										class1.AddClass(classdetails);
										
										if(bench==15) {
											bench=1;
											Class++;
										}
										else {
											bench++;
										}
									}
								}
							}
						}
					}
				}
			}
			for (int j = 3; j <= 5; j += 2) {
				bench = 1;
				Class = 1;
				for (int i = 1; i <= 6; i++) {
					String s = "subject";
					String si = s + i;
					Statement st = con.createStatement();
					String query = "select " + si + ",sessionID from examdetails where branchName='ECE' and semId=" + j;

					ResultSet rs = st.executeQuery(query);
					if (rs != null) {
						while (rs.next()) {
							System.out.println(rs.getString(si));
							String date = rs.getString(si);
							String date1 = "'" + date + "'";
							int sessionId = rs.getInt("sessionID");
							Statement st4 = con.createStatement();
							String query4 = "select benchNumber, classID from classdetails where date=" + date1
									+ " AND side=1";
							ResultSet rs4 = st4.executeQuery(query4);

							if (rs4 != null) {
								while (rs4.next()) {
									bench = rs4.getInt("benchNumber");
									Class = rs4.getInt("classID");
								}
								if (bench == 15) {
									bench = 1;
									Class++;
								} else {
									bench++;
								}
							}
							Statement st2 = con.createStatement();
							String query2 = "select subjectcode from subjectdetails where branch='ECE' AND sem=" + j
									+ " AND subjectID="+i;
							ResultSet rs2 = st2.executeQuery(query2);

							if (rs2 != null) {
								while (rs2.next()) {
									System.out.println(rs2.getString("subjectcode"));
									String subjectcode = rs2.getString("subjectcode");
									subjectcode = "'" + subjectcode + "'";
									Statement st3 = con.createStatement();
									String query3 = "select studentUsn from studentexamdetails where branch='ECE' and (subject1="
											+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
											+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode + " OR subject6="
											+ subjectcode + " OR subject7=" + subjectcode + " OR subject8=" + subjectcode
											+ " OR subject9=" + subjectcode + " OR subject10=" + subjectcode + ")";
									ResultSet rs3 = st3.executeQuery(query3);

									if (rs3 != null) {
										while (rs3.next()) {
											System.out.println(rs3.getString("studentUsn"));
											ClassDetails classdetails = new ClassDetails();
											classdetails.setBenchNumber(bench);
											classdetails.setClassID(Class);
											classdetails.setDate(date);
											classdetails.setSessionId(sessionId);
											classdetails.setSide(side);
											classdetails.setStudentUsn(rs3.getString("studentUsn"));
											
											Class1 class1 = new Class1();
											class1.AddClass(classdetails);
											
											if(bench==15) {
												bench=1;
												Class++;
											}
											else {
												bench++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			for (int i = 1; i <= 5; i++) {
				Class=1;
				bench=1;
				String s = "subject";
				String si = s + i;
				Statement st = con.createStatement();
				String query = "select " + si + ",sessionID from examdetails where branchName='ECE' and semId=7";
				
				ResultSet rs = st.executeQuery(query);
				if (rs != null) {
					while (rs.next()) {
						System.out.println(rs.getString(si));
						String date = rs.getString(si);
						System.out.println(rs.getInt("sessionID"));
						int sessionId = rs.getInt("sessionID");
						Statement st2 = con.createStatement();
						String query2 = "select subjectcode from subjectdetails where branch='ECE' AND sem=7 AND subjectID="+i;
						ResultSet rs2 = st2.executeQuery(query2);

						if (rs2 != null) {
							while (rs2.next()) {
								System.out.println(rs2.getString("subjectcode"));
								String subjectcode = rs2.getString("subjectcode");
								subjectcode="'"+subjectcode+"'";
								Statement st3 = con.createStatement();
								String query3 = "select studentUsn from studentexamdetails where branch='ECE' and (subject1="
										+ subjectcode + " OR subject2=" + subjectcode + " OR subject3=" + subjectcode
										+ " OR subject4=" + subjectcode + " OR subject5=" + subjectcode + " OR subject6="
										+ subjectcode + " OR subject7=" + subjectcode + " OR subject8=" + subjectcode
										+ " OR subject9=" + subjectcode + " OR subject10=" + subjectcode + ")";
								ResultSet rs3 = st3.executeQuery(query3);

								if (rs3 != null) {
									
									while (rs3.next()) {
										
										System.out.println(rs3.getString("studentUsn"));
										ClassDetails classdetails = new ClassDetails();
										classdetails.setBenchNumber(bench);
										classdetails.setClassID(Class);
										classdetails.setDate(date);
										classdetails.setSessionId(sessionId);
										classdetails.setSide(side);
										classdetails.setStudentUsn(rs3.getString("studentUsn"));
										
										Class1 class1 = new Class1();
										class1.AddClass(classdetails);
										
										if(bench==15) {
											bench=1;
											Class++;
										}
										else {
											bench++;
										}
									}
								}
							}
						}
					}
				}
			}
			
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Allotment successful');");
			out.println("location='AdminHomePage.jsp';");
			out.println("</script>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
