package com.rrteam.olb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {

	private static final long serialVersionUID = -6894892329132650887L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String trasactionId;
	
	@Column(name = "accountId", nullable = true, length = 45)
	private String accountId;
	
	@Column(name = "transactionType", nullable = true, length = 45)
	private String transactionType;
	
	@Column(name = "beneficiaryAccountId", nullable = true, length = 45)
	private String beneficiaryAccountId;
	
	@Column(name = "transactionAmount", nullable = true, length = 45)
	private String transactionAmount;
	
	@Column(name = "transactionDt", nullable = true, length = 45)
	private String transactionDt;
	
	@Column(name = "transactionRemark", nullable = true, length = 45)
	private String transactionRemark;

	public String getTrasactionId() {
		return trasactionId;
	}

	public void setTrasactionId(String trasactionId) {
		this.trasactionId = trasactionId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getBeneficiaryAccountId() {
		return beneficiaryAccountId;
	}

	public void setBeneficiaryAccountId(String beneficiaryAccountId) {
		this.beneficiaryAccountId = beneficiaryAccountId;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDt() {
		return transactionDt;
	}

	public void setTransactionDt(String transactionDt) {
		this.transactionDt = transactionDt;
	}

	public String getTransactionRemark() {
		return transactionRemark;
	}

	public void setTransactionRemark(String transactionRemark) {
		this.transactionRemark = transactionRemark;
	}

}
