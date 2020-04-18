package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;  
import java.util.Date; 

@Entity
@Table
public class NotificationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int notificationId;
	String notification;
	String date1;
  
		public int getNotificationId() {
			return notificationId;
		}
		public void setNotificationId(int notificationId) {
			this.notificationId = notificationId;
		}
		public String getNotification() {
			return notification;
		}
		public void setNotification(String notification) {
			this.notification = notification;
		}
		public String getDate1() {
			return date1;
		}
		public void setDate1(String date1) {
			this.date1 = date1;
		}

		

}
