package com.rrteam.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "APPOINTMENT_DB")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long appointmentid;
	
	@Column(name = "CUST_ID",nullable = true, length = 25)
	private Long custid;
	
	@Column(name = "APPOINTMENT_DATE",nullable = true, length = 25)
	private String appointmentdate;
		
	@Column(name = "APPOINTMENT_DESC",nullable = true, length = 30)
	private String description;
	
	@Column(name = "APPOINTMENT_CNF",nullable = true, length = 15)
	private boolean approve;

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public Long getAppointmentid() {
		return appointmentid;
	}

	public void setAppointmentid(Long appointmentid) {
		this.appointmentid = appointmentid;
	}

	public String getAppointmentdate() {
		return appointmentdate;
	}

	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	
	
}