package com.example.Abdielfinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name ="matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "matriculas_id")
	private Long id;
	private Date date;
	@OneToOne
	private Alumno seller;
	@OneToOne
	private Alumno client;
	public Matricula() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Alumno getSeller() {
		return seller;
	}
	public void setSeller(Alumno seller) {
		this.seller = seller;
	}
	public Alumno getClient() {
		return client;
	}
	public void setClient(Alumno client) {
		this.client = client;
	}

	public Matricula(Long id) {
		super();
		this.id = id;
	}
	
}

