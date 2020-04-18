package com.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.NotificationDetails;
import com.pojo.StudentDetails;

public class Notification {
public boolean AddNotification(NotificationDetails notificationDetails) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/configure/NotificationDetails.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(notificationDetails);
		tx.commit();
		
		
		return true;

}
public boolean updateDetails(NotificationDetails notificationDetails) {
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	cfg.configure("com/configure/NotificationDetails.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	
	Transaction tx=session.beginTransaction();  
	Query q=session.createQuery("update NotificationDetails set notification=:v where notificationId=:i");  
	q.setParameter("v",notificationDetails.getNotification());  
	q.setParameter("i",notificationDetails.getNotificationId());  
	  
	int status=q.executeUpdate();  
	System.out.println(status);  
	tx.commit();
	
	return true;
}


}
