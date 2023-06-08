package com.demo.Services;

import com.demo.entities.Prescription;


public interface PrescriptionService {
	public Iterable<Prescription> findAll();
	public Prescription find(long id);
	public Prescription save(Prescription prescription);
	public void delete(long  id);

}
