package com.springbootSpringbootresetserverapi.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Prescription")

public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_prescription;
	@Column
	private String patient;
	@Column
	private String title;
	@Column
	private Date dateOfPrescription;
	@Column
	private String description;
	@Column
	private String medicationList;
	
	
	
	
	
	public Prescription( String patient, String title, Date dateOfPrescription, String description,
			String medicationList) {
		super();
	
		this.patient = patient;
		this.title = title;
		this.dateOfPrescription = dateOfPrescription;
		this.description = description;
		this.medicationList = medicationList;
	}
	public long getId_prescription() {
		return id_prescription;
	}
	public void setId_prescription(int id_prescription) {
		this.id_prescription = id_prescription;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateOfPrescription() {
		return dateOfPrescription;
	}
	public void setDateOfPrescription(Date dateOfPrescription) {
		this.dateOfPrescription = dateOfPrescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMedicationList() {
		return medicationList;
	}
	public void setMedicationList(String medicationList) {
		this.medicationList = medicationList;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	
	

}