package com.amazoncrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazoncrm.entities.Billing;
import com.amazoncrm.entities.Contact;
import com.amazoncrm.services.BillingService;

@Controller
public class BillingController {
	
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		billingService.generateOneBill(bill);
		return "bill_info";
	}
	
	
	@RequestMapping("/listallbills")
	public String listAllContacts(@ModelAttribute("bill") Billing bill,ModelMap model) {
		List<Billing> bills = billingService.findAllBills();
		model.addAttribute("bills", bills);
		return "billing_result";
	}
	

}
