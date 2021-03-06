package com.rrteam.olb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rrteam.olb.model.Customer;
import com.rrteam.olb.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/allCustomer", method = RequestMethod.GET)
	public List<Customer> getAllCustomers() {
		return this.customerService.getAllCustomers();
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public Customer saveCustomer(@RequestBody Customer customer) {
		return this.customerService.saveCustomer(customer);
	}

	@RequestMapping(value = "/{accountid}", method = RequestMethod.GET)
	public Customer findCustomer(@PathVariable("accountid") Integer accountid) {

		return this.customerService.findCustomer(accountid);
	}

	@RequestMapping(value = "/delete/{accountid}", method = RequestMethod.DELETE)
	public void deleteSpecificUser(@PathVariable("accountid") Integer accountid) {
		this.customerService.deleteSpecificCustomer(accountid);
	}

	@RequestMapping(value = "/update/{accountid}", method = RequestMethod.PUT)
	public void updateSpecificUser(@PathVariable("accountid") Integer accountid) {
		this.customerService.updateSpecificUser(accountid);
	}

}
