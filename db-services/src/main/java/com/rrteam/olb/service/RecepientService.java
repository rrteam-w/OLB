package com.rrteam.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rrteam.model.Recepient;
import com.rrteam.repository.RecepientRepository;

@Service
public class RecepientService {
	
	@Autowired
    DataSource dataSource;
    
    @Autowired
    RecepientRepository recepientRepository;
    
  	public String addRecepient(@RequestBody Recepient recepient){
  		this.recepientRepository.saveAndFlush(recepient);
  		return "Succesfully Added Payee";
  	}
  	
  	public List<Recepient> getRecepients(Long custaccountid){
   	 
   	 List<Recepient> payees = this.recepientRepository.findPayementList(custaccountid);    	 
   	 return payees;
    }
    
    public void deleteRecepient(Long recepientid){
   	 
   	 this.recepientRepository.delete(recepientid);
    }
   

}
