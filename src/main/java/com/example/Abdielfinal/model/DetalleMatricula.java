package com.example.Abdielfinal.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_matriculas")

public class DetalleMatricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="detalle_matriculas_id")
	private Long id;
	private Double price;
	private int cantidad;
	@OneToOne
	private Matricula matricula;
	@OneToMany
	private List<Curso> cursos;
	public DetalleMatricula() {
	}
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public Matricula getMatricula() {
		return matricula;
	}



	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}



	public List<Curso> getCursos() {
		return cursos;
	}



	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public DetalleMatricula(Long id) {
		super();
		this.id = id;
	}


	
	
}