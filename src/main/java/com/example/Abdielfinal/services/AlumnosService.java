package com.example.Abdielfinal.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Abdielfinal.model.Alumno;
import com.example.Abdielfinal.repository.AlumnosRepository;


@Service
@Transactional
public class AlumnosService {

	
	private AlumnosRepository alumnosRepository;
	@Autowired
	public AlumnosService(AlumnosRepository alumnosRepository) {
		this.alumnosRepository = alumnosRepository;
	}
	public List<Alumno> getAlumnos(){
		return alumnosRepository.findAll();
		
	}
	public Alumno getAlumno(String dni) {
		return alumnosRepository.getAlumnoByDni(dni);
	}
	
	
}
