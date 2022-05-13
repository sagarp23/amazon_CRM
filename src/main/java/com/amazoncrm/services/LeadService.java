package com.amazoncrm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazoncrm.entities.Lead;

@Service
public interface LeadService {
	
	
	public void saveLead (Lead lead) ;

	public List<Lead> findAllLeads();

	public Lead getLead(long id);

	public void deleteLead(long id);



	

}
