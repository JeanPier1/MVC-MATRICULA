package com.example.Abdielfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="alumnos")

public class Alumno {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="alumno_id")	
private Long id;
private String name;
private String lastname;
private String dni;
private String phonenumber;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public Alumno() {
}
public Alumno(Long id) {
	super();
	this.id = id;
}



}

