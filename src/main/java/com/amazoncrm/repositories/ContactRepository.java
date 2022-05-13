package com.amazoncrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazoncrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
