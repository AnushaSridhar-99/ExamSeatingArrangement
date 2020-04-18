package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.StudentDetails;
import com.pojo.StudentExamDetails;

public class StudentExam {
public boolean AddNewStudent(StudentExamDetails studentexamDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/StudentExamDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(studentexamDetails);
		tx.commit();
		
		
		return true;

}
}
