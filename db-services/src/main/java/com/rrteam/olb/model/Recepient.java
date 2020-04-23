package com.rrteam.olb.model;

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
@Table(name = "recipient")
@SequenceGenerator(name="recseq", initialValue=3001, allocationSize=998)
public class Recepient {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cust_id", nullable = false)
	private Customer customer;

	@Column(name = "beneficiary_account_id", nullable = true, length = 45)
	private String beneficiaryAccountId;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="recseq")
	@Column(name = "beneficiary_Id")
	private int beneficiaryId;

	@Column(name = "beneficiary_name", nullable = true, length = 45)
	private String beneficiaryName;

	@Column(name = "beneficiary_phone", nullable = true, length = 45)
	private String beneficiaryPhone;

	@Column(name = "beneficiary_email", nullable = true, length = 45)
	private String beneficiaryEmail;

	@Column(name = "beneficiary_type", nullable = true, length = 45)
	private String beneficiaryType;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBeneficiaryAccountId() {
		return beneficiaryAccountId;
	}

	public void setBeneficiaryAccountId(String beneficiaryAccountId) {
		this.beneficiaryAccountId = beneficiaryAccountId;
	}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryPhone() {
		return beneficiaryPhone;
	}

	public void setBeneficiaryPhone(String beneficiaryPhone) {
		this.beneficiaryPhone = beneficiaryPhone;
	}

	public String getBeneficiaryEmail() {
		return beneficiaryEmail;
	}

	public void setBeneficiaryEmail(String beneficiaryEmail) {
		this.beneficiaryEmail = beneficiaryEmail;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}
	
	
}
