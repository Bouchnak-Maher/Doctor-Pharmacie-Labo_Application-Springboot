package com.demo.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="Radiographie")

public class Radiographie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_radiographie;
	@Column
	private String patient;
	@Column
	private String type_radiographie;
    @Column
    private String resultat="encours.jpg";
    
	
	@Column
	private Date date_radiographie;
	public long getId_radiographie() {
		return id_radiographie;
	}
	public void setId_radiographie(long id_radiographie) {
		this.id_radiographie = id_radiographie;
	}
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getType_radiographie() {
		return type_radiographie;
	}
	public void setType_radiographie(String type_radiographie) {
		this.type_radiographie = type_radiographie;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public Date getDate_radiographie() {
		return date_radiographie;
	}
	public void setDate_radiographie(Date date_radiographie) {
		this.date_radiographie = date_radiographie;
	}
	
	
	
}
	