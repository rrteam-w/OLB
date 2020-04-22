package com.rrteam.olb.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rrteam.olb.model.Recepient;
import com.rrteam.olb.repository.RecepientRepository;

@Service
public class RecepientService {
	
	@Autowired
    DataSource dataSource;
    
    @Autowired
    RecepientRepository recepientRepository;
    
  	public Recepient addRecepient(Recepient recepient){
  		return recepientRepository.saveAndFlush(recepient);  		
  	}
  	
  	public List<Recepient> getRecepients(Integer custId){   	 
   	 return this.recepientRepository.findByCustId(custId);
    }
    
    public void deleteRecepient(Integer recepientid){
   	 
   	   this.recepientRepository.deleteById(recepientid);
    }
   

}
