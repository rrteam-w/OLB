package com.rrteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrteam.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	
	
//	Appointment createAppointment(Appointment appointment);
//
//    List<Appointment> findAll();
//
//    Appointment findAppointment(Long id);
//
//    void confirmAppointment(Long id);

}
