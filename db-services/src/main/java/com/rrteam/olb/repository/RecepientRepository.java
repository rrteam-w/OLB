package com.rrteam.olb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.rrteam.olb.model.Recepient;

public interface RecepientRepository extends JpaRepository<Recepient, Long>{
	
	@Query(
	        value = "SELECT * FROM recepient_db t where t.CUST_ID = :CUST_ID", 
	        nativeQuery=true
	    )
    public List<Recepient> findPayementList(@Param("CUST_ID") Long  CUST_ID);
	
	 @Modifying	
	 @Transactional 

	 @Query(
		        value = "DELETE FROM recepient_db t where t.beneficiaryid = :beneficiaryid",
		        nativeQuery=true
		    )
	public Long deleteRecepient(@Param("beneficiaryid") Long  beneficiaryid);


}
