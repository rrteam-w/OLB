package com.rrteam.olb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrteam.olb.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
