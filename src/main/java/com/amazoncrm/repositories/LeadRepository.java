package com.amazoncrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazoncrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
