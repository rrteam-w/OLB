package com.rrteam.olb.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="account")
//@SequenceGenerator(name="accseq", initialValue=4001, allocationSize=998)
public class Account implements Serializable {

	private static final long serialVersionUID = -2596900152895137272L;
	
	@Id
	@Column(name="account_Id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="accseq")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cust_id", nullable = false)
	private Customer customer;
	
	@Column(name="account_balance")
	private String accountBalance;
	
	@Column(name="account_type")
	private String accountType;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "account")
	private Set<Transaction> transactions = new HashSet<>();

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
}
