package com.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_patient;
	@Column
	private String Full_name;
	@Column
	private Date BirthDate;
	@Column
	private String sex;
	public long getId_patient() {
		return id_patient;
	}
	public void setId_patient(long id_patient) {
		this.id_patient = id_patient;
	}
	public String getFull_name() {
		return Full_name;
	}
	public void setFull_name(String full_name) {
		Full_name = full_name;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
}