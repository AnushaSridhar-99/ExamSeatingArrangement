package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.pojo.TeacherDetails;

public class Teacher {
	public boolean registerTeacher(TeacherDetails teacherDetails) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/configure/TeacherDetails.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//session.save(teacherDetails);
		session.persist(teacherDetails);
		transaction.commit();
		
		return true;
	}
	public List TeacherDetails(TeacherDetails teacherDetails) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/configure/TeacherDetails.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(TeacherDetails.class);
		criteria.add(Restrictions.eq("id", teacherDetails.getId()));
		List teacher=criteria.list();
		transaction.commit();
		return teacher;
		
	}
	public boolean UpdatePassword(TeacherDetails teacherdetails) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/TeacherDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();  
		Query q=session.createQuery("update TeacherDetails set password=:v where id=:i");  
		q.setParameter("v",teacherdetails.getPassword());  
		q.setParameter("i",teacherdetails.getId());  
		  
		int status=q.executeUpdate();  
		System.out.println(status);  
		tx.commit();
		
		return true;
	}
}
