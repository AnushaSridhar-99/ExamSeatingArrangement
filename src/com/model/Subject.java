package com.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.StudentDetails;
import com.pojo.SubjectDetails;

public class Subject {
	
public boolean AddSubject(SubjectDetails subjectDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/SubjectDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(subjectDetails);
		tx.commit();
		
		
		return true;
	}
	public boolean UpdateSubject(SubjectDetails subjectDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/SubjectDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();  
		Query q=session.createQuery("update SubjectDetails set subjectname=:v, subjectcode=:c, branch=:b, sem=:s where id=:i");  
		q.setParameter("v",subjectDetails.getSubjectname());  
		q.setParameter("c",subjectDetails.getSubjectcode());  
		q.setParameter("b",subjectDetails.getBranch()); 
		q.setParameter("s",subjectDetails.getSem());  
		q.setParameter("i",subjectDetails.getId()); 
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();
		
		
		return true;
	}
}
