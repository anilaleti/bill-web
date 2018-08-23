package com.sreenu.dao;

import com.sreenu.entity.Receipt;

public interface BillDao {
	
	public void saveReceipt(Receipt receipt);
	
	public void payDueAmount(String mobileNumber, int dueAmount);
	
	public void findReceiptByMobileNumber(String mobileNumber);
	

}
