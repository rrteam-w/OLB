package com.rrteam.olb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrteam.olb.repository.CustomerRepository;

@Service
public class OlbService {
	
	@Autowired
	CustomerRepository customerRepository;

}
