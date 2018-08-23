package com.sreenu.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sreenu.entity.DuePay;
import com.sreenu.entity.Receipt;

public class BillDaoImpl implements BillDao {

	public static EntityManager em;
	static {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();
	}

	public void saveReceipt(Receipt receipt) {
		em.getTransaction().begin();
		em.persist(receipt);
		em.getTransaction().commit();

	}

	public void payDueAmount(String mobileNumber, int dueAmount) {
		//String query = "select r.dueAmount from Receipt r where r.mobileNumber =:mobileNumber";

		/*
		 * Query q =em.createQuery(query); q.setParameter("mobileNumber",
		 * mobileNumber);
		 * System.out.println("============="+q.getSingleResult()); Integer
		 * totalDueAmount = (Integer)q.getSingleResult();
		 */ // store due paid detils in Duepay table
		System.out.println(em.find(Receipt.class, mobileNumber));
		Receipt receipt = em.find(Receipt.class, mobileNumber);

		int currentDue = receipt.getDueAmount() - dueAmount;

		/**
		 * store the records in due pay table
		 */
		DuePay duePay = new DuePay();
		duePay.setBatchNo(receipt.getBatchNo());
		duePay.setStudentId(receipt.getStudentId());
		duePay.setStudentName(receipt.getStudentName());
		duePay.setCourse(receipt.getCourse());
		duePay.setDate("08-08-2018");
		duePay.setDuePaid(dueAmount);
		duePay.setEmailId(receipt.getEmailId());
		duePay.setStudentName(receipt.getStudentName());
		duePay.setTotalDueAmount(receipt.getDueAmount());
		duePay.setMobileNumber(mobileNumber);
		duePay.setBalDueAmount(currentDue);
		/**
		 * transaction begin
		 */
		em.getTransaction().begin();
		
		em.persist(duePay);

		/**
		 * upadating previous Receipt Due with due paid amount
		 */
		receipt.setDueAmount(currentDue);
	/**
	 * updating total amount in Receipt table
	 */
		Integer  currentTotalAmount = receipt.getTotaAmount()+dueAmount;
		receipt.setTotaAmount(currentTotalAmount);

		em.persist(receipt);
		em.getTransaction().commit();

	};

	public void findReceiptByMobileNumber(String mobileNumber) {

		System.out.println("receipt data" + em.find(Receipt.class, mobileNumber));

	};
}
