package com.example.Abdielfinal.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Abdielfinal.model.DetalleMatricula;
import com.example.Abdielfinal.repository.DetalleMatriculaRepository;


@Service
@Transactional
public class DetalleMatriculasServices {

	private DetalleMatriculaRepository detalle_MatriculaRepository ;
	@Autowired 
	public DetalleMatriculasServices (DetalleMatriculaRepository detalle_MatriculaRepository) {
		
	this.detalle_MatriculaRepository = detalle_MatriculaRepository;

	}
	public DetalleMatricula createDetalle(DetalleMatricula detalleMatricula) {
		return detalle_MatriculaRepository.save(detalleMatricula);
		
	}
	}


