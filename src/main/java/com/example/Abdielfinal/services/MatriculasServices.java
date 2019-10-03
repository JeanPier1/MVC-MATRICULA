package com.example.Abdielfinal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Abdielfinal.model.Matricula;
import com.example.Abdielfinal.repository.MatriculaRepository;


@Service
@Transactional
public class MatriculasServices {

	private  MatriculaRepository  matriculaRepository;
	@Autowired
	public MatriculasServices (MatriculaRepository matriculaRepository) {
	this.matriculaRepository =matriculaRepository;	
	}
	public Matricula doMatricula(Matricula matricula) {
		return matriculaRepository.save(matricula);
	}
	
}
