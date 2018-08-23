package com.sreenu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RECEIPT")
public class Receipt {
	public Receipt() {
	}

	
	@Column
	private String batchNo;
	@Column
	private String studentId;
	@Column
	private String course;
	@Column
	private String date;
	@Column
	private String studentName;
	@Id
	@Column
	private String mobileNumber;
	@Column
	private String emailId;
	@Column
	private String rupeesInWords;
	@Column
	private String paidBy;
	@Column
	private String paymentMadeFor;
	@Column
	private int totaAmount;
	@Column
	private int dueAmount;

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

	public String getRupeesInWords() {
		return rupeesInWords;
	}

	public void setRupeesInWords(String rupeesInWords) {
		this.rupeesInWords = rupeesInWords;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}

	public String getPaymentMadeFor() {
		return paymentMadeFor;
	}

	public void setPaymentMadeFor(String paymentMadeFor) {
		this.paymentMadeFor = paymentMadeFor;
	}

	public int getTotaAmount() {
		return totaAmount;
	}

	public void setTotaAmount(int totaAmount) {
		this.totaAmount = totaAmount;
	}

	public int getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}

	@Override
	public String toString() {
		return "Receipt [batchNo=" + batchNo + ", studentId=" + studentId + ", course=" + course + ", date=" + date
				+ ", studentName=" + studentName + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", rupeesInWords=" + rupeesInWords + ", paidBy=" + paidBy + ", paymentMadeFor=" + paymentMadeFor
				+ ", totaAmount=" + totaAmount + ", dueAmount=" + dueAmount + "]";
	}

}
