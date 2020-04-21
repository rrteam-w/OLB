package com.rrteam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rrteam.model.Appointment;
import com.rrteam.service.AppointmentService;

@RestController
@RequestMapping("/appointment") 
public class AppointmentController {


	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping(value = "/createappointment", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String scheduleAppointment(@RequestBody Appointment appointment) {
		String status = this.appointmentService.scheduleAppointment(appointment);
		return status;
	}
	@RequestMapping(value = "/allappointments", method = RequestMethod.GET)
    public List<Appointment> allAppointments(){
    	return this.appointmentService.allAppointments();
    }
	
	@RequestMapping(value = "/{appointmentid}", method = RequestMethod.GET)
	public Appointment myScheduleAppointment(@PathVariable("appointmentid") Long appointmentid){
		
		return this.appointmentService.myScheduleAppointment(appointmentid);
	}


	
}
