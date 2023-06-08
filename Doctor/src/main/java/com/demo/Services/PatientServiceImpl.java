package com.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Patient;
import com.demo.repositories.PatientRepository;
@Service("PatientService")
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository;
	@Override
	public Iterable<Patient> findAll() {
		return patientRepository.findAll();
	}




	

	@Override
	public Patient find(long id) {

		return patientRepository.findById(id).get();
	}

	@Override
	public void delete(long id) {
		patientRepository.deleteById(id);
		
	}


	@Override
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}


}
