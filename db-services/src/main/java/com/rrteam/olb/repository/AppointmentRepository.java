package com.rrteam.olb.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rrteam.olb.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
