package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Radiographie;
@Repository("RadiographieRepository")
public interface RadiographieRepository extends CrudRepository<Radiographie,Long> {
	
	

}
