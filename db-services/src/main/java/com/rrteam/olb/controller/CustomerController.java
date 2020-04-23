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

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Customer> getAllUsers() {
		return this.customerService.getAllCustomers();
	}

	
	  @RequestMapping(value = "/adduser", method = RequestMethod.POST, consumes =
	  MediaType.APPLICATION_JSON_VALUE, produces =
	  MediaType.APPLICATION_JSON_VALUE)
	  
	  @ResponseBody() public Customer addNewUser(@RequestBody Customer customer) {
	  return this.customerService.addUser(customer); }
	  
	  @RequestMapping(value = "/{accountid}", method = RequestMethod.GET) public
	  Customer getSpecificUser(@PathVariable("accountid") Integer accountid) {
	  int i = 10;
	  return this.customerService.getSpecificUser(accountid);
	  }
	  
	  @RequestMapping(value = "/delete/{accountid}", method = RequestMethod.DELETE)
	  public void deleteSpecificUser(@PathVariable("accountid") Integer accountid)
	  { this.customerService.deleteSpecificUser(accountid); }
	  
	  @RequestMapping(value = "/update/{accountid}", method = RequestMethod.PUT)
	  public void updateSpecificUser(@PathVariable("accountid") Integer accountid)
	  { this.customerService.updateSpecificUser(accountid); }
	 
}
