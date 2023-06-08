package com.demo.Services;

import com.demo.entities.Radiographie;

public interface RadiographieService {
	public Iterable<Radiographie> findAll();
	public Radiographie find(long id);
	public Radiographie save(Radiographie radiographie);
	public void delete(long  id);
	

}
