package com.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ClassDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int classID;
	int sessionId;
	String date;
	int benchNumber;
	int side;
	String studentUsn;
	
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getBenchNumber() {
		return benchNumber;
	}
	public void setBenchNumber(int benchNumber) {
		this.benchNumber = benchNumber;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public String getStudentUsn() {
		return studentUsn;
	}
	public void setStudentUsn(String studentUsn) {
		this.studentUsn = studentUsn;
	}

}
