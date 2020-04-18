package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.pojo.StudentDetails;
import com.pojo.TeacherDetails;

public class Student {
	
	public boolean RegisterNewStudent(StudentDetails studentsDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/StudentDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(studentsDetails);
		tx.commit();
		
		
		return true;
	}
	
	public boolean updateStudent(StudentDetails studentDetails) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/StudentDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();  
		Query q=session.createQuery("update StudentDetails set verified=:v where id=:i");  
		q.setParameter("v",studentDetails.getVerified());  
		q.setParameter("i",studentDetails.getId());  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();
		
		return true;
	}
	
public List StudentDetails(StudentDetails studentDetails) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/configure/StudentDetails.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(StudentDetails.class);
		criteria.add(Restrictions.eq("name", studentDetails.getName()));
		//criteria.add(Restrictions.eq("verified", 1));
		List student=criteria.list();
		transaction.commit();
		return student;
		
	}

	public boolean UpdatePassword(StudentDetails studentdetails) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/StudentDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();  
		Query q=session.createQuery("update StudentDetails set password=:v where id=:i");  
		q.setParameter("v",studentdetails.getPassword());  
		q.setParameter("i",studentdetails.getId());  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();
		
		return true;
	}
}

