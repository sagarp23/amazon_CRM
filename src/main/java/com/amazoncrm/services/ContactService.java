package com.amazoncrm.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.amazoncrm.entities.Contact;


public interface ContactService {
	
	
	public void saveContact (Contact contact) ;

	public List<Contact> findAllContacts();

	public Contact getContact(long id);


	

}
