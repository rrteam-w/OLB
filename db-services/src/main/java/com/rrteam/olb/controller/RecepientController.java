package com.rrteam.olb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrteam.olb.model.Recepient;
import com.rrteam.olb.service.RecepientService;


@RestController
@RequestMapping("/recepient") 
public class RecepientController {
	
	@Autowired
	RecepientService recepientService;
	
	
	  @RequestMapping(value = "/add", method = RequestMethod.POST,consumes =
	  MediaType.APPLICATION_JSON_VALUE) public Recepient addRecepient(@RequestBody
	  Recepient recepient){ return this.recepientService.addRecepient(recepient); }
	  
	  @RequestMapping(value = "/findrecepients/{custaccountid}", method =
	  RequestMethod.GET) public List<Recepient>
	  getRecepients(@PathVariable("custaccountid") Integer custaccountid){
	  
	  List<Recepient> recepients =
	  this.recepientService.getRecepients(custaccountid); return recepients; }
	  
	  @RequestMapping(value = "/deleterecepient/{recepientid}", method =
	  RequestMethod.DELETE) public String
	  deleteRecepient(@PathVariable("recepientid") Integer recepientid){
	  
	  this.recepientService.deleteRecepient(recepientid); return "Deleted Payee";
	  
	  }
	 


}
