package com.example.Abdielfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =  "roles ")

public class Rol {

@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
@Column(name ="roles_id " )
private Long id ;
private String name ;
public Rol() {
	super();
}
public Rol(Long id) {
	super();
	this.id = id;
}
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


}
