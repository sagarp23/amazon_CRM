package com.amazoncrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazoncrm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
