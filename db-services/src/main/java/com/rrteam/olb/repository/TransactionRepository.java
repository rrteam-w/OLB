package com.rrteam.olb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrteam.olb.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
