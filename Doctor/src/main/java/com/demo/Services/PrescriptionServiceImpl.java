package com.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Prescription;
import com.demo.repositories.PrescriptionRepository;
@Service("PrescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	@Override
	public Iterable<Prescription> findAll() {
		return prescriptionRepository.findAll();
	}


	@Override
	public Prescription save (Prescription prescription) {
		
		return prescriptionRepository.save(prescription);
	}

	

	@Override
	public Prescription find(long id) {

		return prescriptionRepository.findById(id).get();
	}

	@Override
	public void delete(long id) {
		prescriptionRepository.deleteById(id);
		
	}


}
