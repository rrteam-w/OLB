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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "customer")
@Entity
@SequenceGenerator(name="cusseq", initialValue=2001, allocationSize=998)
public class Customer implements Serializable {

	private static final long serialVersionUID = 8154553394154317648L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cusseq")
	@Column(name = "cust_id")
	private int custId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	 public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public Set<Recepient> getRecepients() {
		return recepients;
	}

	public void setRecepients(Set<Recepient> recepients) {
		this.recepients = recepients;
	}

	public Set<Recepient> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Recepient> appointments) {
		this.appointments = appointments;
	}

	@OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "customer")
	private Set<Account> accounts = new HashSet<>();
	
	 @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "customer")
	private Set<Recepient> recepients = new HashSet<>();
	 
	 @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "customer")
	private Set<Recepient> appointments = new HashSet<>();
	
	
	

}
