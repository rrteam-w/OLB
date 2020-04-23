package com.rrteam.olb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rrteam.olb.model.Recepient;

@Repository
public interface RecepientRepository extends JpaRepository<Recepient, Integer> {

	@Query(value = "SELECT * FROM recepient t where t.custId = :CUST_ID", nativeQuery = true)
	public List<Recepient> findPayementList(@Param("CUST_ID") Long CUST_ID);

	@Query(value = "SELECT * FROM recepient t where t.custId = :custId", nativeQuery = true)
	public List<Recepient> findByCustId(@Param("custId") Integer custId);

}
