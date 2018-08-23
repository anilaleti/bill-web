package com.sreenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class DuePay {
	
	@Column
	private String batchNo;
	@Id
	@Column
	private String studentId;
	@Column
	private String course;
	@Column
	private String date;
	@Column
	private String studentName;
	@Column
	private String mobileNumber;
	@Column
	private String emailId;
	@Column
	private int totalDueAmount;
	@Column
	private int duePaid;
	@Column
	private int balDueAmount ;
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getTotalDueAmount() {
		return totalDueAmount;
	}
	public void setTotalDueAmount(int totalDueAmount) {
		this.totalDueAmount = totalDueAmount;
	}
	public int getDuePaid() {
		return duePaid;
	}
	public void setDuePaid(int duePaid) {
		this.duePaid = duePaid;
	}
	public int getBalDueAmount() {
		return balDueAmount;
	}
	public void setBalDueAmount(int balDueAmount) {
		this.balDueAmount = balDueAmount;
	}
	
	


}
