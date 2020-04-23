package com.rrteam.olb.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrteam.olb.model.Appointment;
import com.rrteam.olb.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	
	@Autowired
    DataSource dataSource;
    
    @Autowired
    AppointmentRepository appointmentrepo;
	
	 public String scheduleAppointment(Appointment appointment){
	  this.appointmentrepo.saveAndFlush(appointment);
   	  return "appointment is fixed";
   }
	 
	 public List<Appointment> allAppointments() {
	        return appointmentrepo.findAll();
	    }	 
}
