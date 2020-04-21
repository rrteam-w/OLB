package com.rrteam.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Accounts")
public class Accounts implements Serializable {

	
	private static final long serialVersionUID = -2596900152895137272L;
	
	private String accountId;
	private String custId;
	private String accountBalance;
	private String accountType;
	private List<Transactions> transactionDetails;
	
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
	public List<Transactions> getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(List<Transactions> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
	
	
	
	

}
