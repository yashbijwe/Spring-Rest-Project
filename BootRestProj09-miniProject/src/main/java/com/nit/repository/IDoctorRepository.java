package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nit.Entity.DoctorEntity;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Integer>{
	
	@Query("delete from DoctorEntity  where fee>=:start and fee<=:end")
	@Modifying
	@Transactional
	public   int  removeDoctorsByFeeRange(float start,float end);

}
