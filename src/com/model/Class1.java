package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.ClassDetails;
import com.pojo.ExamDetails;

public class Class1 {
public boolean AddClass(ClassDetails classDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/ClassDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(classDetails);
		tx.commit();
		
		
		return true;

}
}
