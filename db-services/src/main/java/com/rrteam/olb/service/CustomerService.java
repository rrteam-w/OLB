package com.rrteam.olb.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrteam.olb.model.Customer;
import com.rrteam.olb.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		List<Customer> custsList = new ArrayList<>();
		Iterable<Customer> cuslist = customerRepository.findAll();
		Iterator<Customer> userit = cuslist.iterator();
		while(userit.hasNext()) {
			Customer user = userit.next();
			custsList.add(user);
		}
		return custsList;
	}

	public Customer addUser(Customer customer) {
		return null;
	}

	public void deleteSpecificUser(Integer accountid) {

	}

	public void updateSpecificUser(Integer accountid) {

	}

	public Customer getSpecificUser(Integer accountid) {
		
		return null;
	}

}
