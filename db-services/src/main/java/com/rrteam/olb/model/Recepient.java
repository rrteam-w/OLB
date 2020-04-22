package com.rrteam.olb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipient")
public class Recepient {

	@Column(name = "custid", nullable = true, length = 40)
	private Long custid;

	@Column(name = "beneficiary_account_id", nullable = true, length = 45)
	private String beneficiary_account_id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long beneficiary_Id;

	@Column(name = "beneficiary_name", nullable = true, length = 45)
	private String beneficiary_name;

	@Column(name = "beneficiary_phone", nullable = true, length = 45)
	private String beneficiary_phone;

	@Column(name = "beneficiary_email", nullable = true, length = 45)
	private String beneficiary_email;

	@Column(name = "beneficiary_type", nullable = true, length = 45)
	private String beneficiary_type;

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public String getBeneficiary_account_id() {
		return beneficiary_account_id;
	}

	public void setBeneficiary_account_id(String beneficiary_account_id) {
		this.beneficiary_account_id = beneficiary_account_id;
	}

	public Long getBeneficiary_Id() {
		return beneficiary_Id;
	}

	public void setBeneficiary_Id(Long beneficiary_Id) {
		this.beneficiary_Id = beneficiary_Id;
	}

	public String getBeneficiary_name() {
		return beneficiary_name;
	}

	public void setBeneficiary_name(String beneficiary_name) {
		this.beneficiary_name = beneficiary_name;
	}

	public String getBeneficiary_phone() {
		return beneficiary_phone;
	}

	public void setBeneficiary_phone(String beneficiary_phone) {
		this.beneficiary_phone = beneficiary_phone;
	}

	public String getBeneficiary_email() {
		return beneficiary_email;
	}

	public void setBeneficiary_email(String beneficiary_email) {
		this.beneficiary_email = beneficiary_email;
	}

	public String getBeneficiary_type() {
		return beneficiary_type;
	}

	public void setBeneficiary_type(String beneficiary_type) {
		this.beneficiary_type = beneficiary_type;
	}

}
