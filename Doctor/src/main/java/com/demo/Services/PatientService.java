package com.demo.Services;

import com.demo.entities.Patient;


public interface PatientService {
	public Iterable<Patient> findAll();
	public Patient find(long id);
	public Patient save(Patient patient);
	public void delete(long  id);

}
