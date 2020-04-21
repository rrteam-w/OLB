package com.rrteam.olb.model;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account implements Serializable {

	private static final long serialVersionUID = -2596900152895137272L;
	
	@Column(name="accountId")
	private String accountId;
	
	@Id
	@Column(name="custId")
	private String custId;
	
	@Column(name="accountBalance")
	private String accountBalance;
	
	@Column(name="accountType")
	private String accountType;
	
	private List<Transaction> transactions;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactionDetails(List<Transaction> transactions) {
		this.transactions = transactions;
	}
}
