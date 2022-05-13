package com.amazoncrm.services;

import java.util.List;

import com.amazoncrm.entities.Billing;

public interface BillingService {

	
	public void generateOneBill(Billing bill) ;

	public List<Billing> findAllBills();
		
	
}
