package com.sreenu.service;

import com.sreenu.entity.Receipt;

public interface BillService {
	
public void saveReceipt(Receipt receipt);
	
	public void payDueAmount(String mobileNumber, int dueAmount);
	
	public void findReceiptByMobileNumber(String mobileNumber);
	

}
