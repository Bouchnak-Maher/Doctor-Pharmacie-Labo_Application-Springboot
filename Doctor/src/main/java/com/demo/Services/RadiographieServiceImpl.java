package com.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Radiographie;
import com.demo.repositories.RadiographieRepository;
@Service("RadiographieService")
public class RadiographieServiceImpl implements RadiographieService {
	@Autowired
	private RadiographieRepository radiographieRepository;
	@Override
	public Iterable<Radiographie> findAll() {
		return radiographieRepository.findAll();
	}


	@Override
	public Radiographie  save (Radiographie radiographie) {
		
		return radiographieRepository.save(radiographie);
	}

	

	@Override
	public Radiographie find(long id) {

		return radiographieRepository.findById(id).get();
	}

	@Override
	public void delete(long id) {
		radiographieRepository.deleteById(id);
		
	}


}
