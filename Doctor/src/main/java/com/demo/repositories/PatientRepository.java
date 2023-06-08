package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Patient;
@Repository("PatientRepository")
public interface PatientRepository extends CrudRepository<Patient,Long> {
	
	

}
