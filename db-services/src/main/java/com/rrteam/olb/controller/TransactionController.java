package com.rrteam.olb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrteam.olb.model.Transaction;
import com.rrteam.olb.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService tranactionService;
	
	@RequestMapping(value = "/getAllTransactions", method = RequestMethod.GET,consumes= MediaType.APPLICATION_JSON_VALUE)
	public List<Transaction> getTransactions(@PathVariable("custid") Integer custid) {
		List<Transaction> list = this.tranactionService.getTransactions(custid);
		return list;
	}
}
