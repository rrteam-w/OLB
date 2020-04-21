package com.rrteam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrteam.model.Recepient;
import com.rrteam.service.RecepientService;

@RestController
@RequestMapping("/recepient") 
public class RecepientController {
	
	@Autowired
	RecepientService recepientService;
	
	  //add payee
  	@RequestMapping(value = "/addrecepient", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
  	public String addRecepient(@RequestBody Recepient recepient){
  		this.recepientService.addRecepient(recepient);
  		return "Succesfully Added Payee";
  	}
  	
	@RequestMapping(value = "/recepients/{custaccountid}", method = RequestMethod.GET)
	public List<Recepient> getRecepients(@PathVariable("custaccountid") Long custaccountid){
	
		List<Recepient> recepients = this.recepientService.getRecepients(custaccountid);
		return recepients;
	}
	
	@RequestMapping(value = "/deleterecepient/{recepientid}", method = RequestMethod.DELETE)
	public String deleteRecepient(@PathVariable("recepientid") Long recepientid){
		
		this.recepientService.deleteRecepient(recepientid);
		return "Deleted Payee";
		
	}


}
