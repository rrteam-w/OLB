package com.rrteam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recepient_DB")
public class Recepient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long beneficiaryid;

	@Column(name = "CUST_ID", nullable = true, length = 20)
	private Long custid;

	@Column(name = "ACCOUNT_NUMBER", nullable = true, length = 25)
	private String beneficiaryaccnum;

	@Column(name = "PHONE_NUMBER", nullable = true, length = 25)
	private String beneficiaryphnum;

	@Column(name = "EMAIL", nullable = true, length = 25)
	private String beneficiaryemail;

	@Column(name = "BENEFICIARY_TYPE", nullable = true, length = 15)
	private String beneficarytype;

	@Column(name = "BENEFICIARY_BANK", nullable = true, length = 20)
	private String beneficiarybank;

	public Long getBeneficiaryid() {
		return beneficiaryid;
	}

	public void setBeneficiaryid(Long beneficiaryid) {
		this.beneficiaryid = beneficiaryid;
	}

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public String getBeneficiaryaccnum() {
		return beneficiaryaccnum;
	}

	public void setBeneficiaryaccnum(String beneficiaryaccnum) {
		this.beneficiaryaccnum = beneficiaryaccnum;
	}

	public String getBeneficiaryphnum() {
		return beneficiaryphnum;
	}

	public void setBeneficiaryphnum(String beneficiaryphnum) {
		this.beneficiaryphnum = beneficiaryphnum;
	}

	public String getBeneficiaryemail() {
		return beneficiaryemail;
	}

	public void setBeneficiaryemail(String beneficiaryemail) {
		this.beneficiaryemail = beneficiaryemail;
	}

	public String getBeneficarytype() {
		return beneficarytype;
	}

	public void setBeneficarytype(String beneficarytype) {
		this.beneficarytype = beneficarytype;
	}

	public String getBeneficiarybank() {
		return beneficiarybank;
	}

	public void setBeneficiarybank(String beneficiarybank) {
		this.beneficiarybank = beneficiarybank;
	}

}
