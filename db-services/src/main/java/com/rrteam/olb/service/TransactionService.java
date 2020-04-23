package com.rrteam.olb.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rrteam.olb.model.Transaction;
import com.rrteam.olb.repository.TransactionRepository;

public class TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository;

	public List<Transaction> getTransactions(Integer custid) {
		
		List<Transaction> transList = new ArrayList<>();
		Iterable<Transaction> tranlist = transactionRepository.findAll();
		Iterator<Transaction> tranit = tranlist.iterator();
		while(tranit.hasNext()) {
			Transaction tran = tranit.next();
			transList.add(tran);
		}
		return transList;
	}
}
