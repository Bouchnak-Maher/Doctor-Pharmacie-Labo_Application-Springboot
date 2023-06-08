package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Prescription;
@Repository("PrescriptionRepository")
public interface PrescriptionRepository extends CrudRepository<Prescription,Long> {
	
	

}
