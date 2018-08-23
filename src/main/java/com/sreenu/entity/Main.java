  package com.sreenu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sreenu.dao.BillDao;
import com.sreenu.dao.BillDaoImpl;



public class Main {
	
	
	public static void main (String args[]) throws ParseException {
		
		EntityManager em;
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
		
		
		Receipt receipt = new Receipt();
		receipt.setBatchNo("RTP3820");
		receipt.setStudentId("RTP3981");
		receipt.setCourse("JRTP");
		receipt.setDate("08-08-2018");
		receipt.setStudentName("Anil");
		receipt.setMobileNumber("9177726166");
		receipt.setEmailId("anil.javaws");
		receipt.setRupeesInWords("three");
		receipt.setPaidBy("cash");
		receipt.setPaymentMadeFor("JRP");
		receipt.setTotaAmount(5000);
		receipt.setDueAmount(5000);
		BillDao dao = new BillDaoImpl();
		
		String mobileNumber ="9177726166";
	
		 //save receipt
		
		//dao.saveReceipt(receipt);
		
		//pay dueamount
		
		dao.payDueAmount(mobileNumber,2000);
		
		// ndao.findReceiptByMobileNumber(mobileNumber);
		
		/*
		em.getTransaction().begin();
		em.persist(receipt);
		em.getTransaction().commit();
*/	}


}
