package com.rrteam.olb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
@SequenceGenerator(name="transeq", initialValue=5001, allocationSize=998)
public class Transaction implements Serializable {

	private static final long serialVersionUID = -6894892329132650887L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="transeq")
	@Column(name = "trasaction_id")
	private int trasactionId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
	private Account account;
	
	@Column(name = "transaction_type", nullable = true, length = 45)
	private String transactionType;
	
	@Column(name = "beneficiary_account_id", nullable = true, length = 45)
	private String beneficiaryAccountId;
	
	@Column(name = "transaction_amount", nullable = true, length = 45)
	private String transactionAmount;
	
	@Column(name = "transaction_dt", nullable = true, length = 45)
	private String transactionDt;
	
	@Column(name = "transaction_remark", nullable = true, length = 45)
	private String transactionRemark;

	public int getTrasactionId() {
		return trasactionId;
	}

	public void setTrasactionId(int trasactionId) {
		this.trasactionId = trasactionId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
