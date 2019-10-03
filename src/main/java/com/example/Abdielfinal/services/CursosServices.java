package com.example.Abdielfinal.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Abdielfinal.model.Curso;
import com.example.Abdielfinal.repository.CursoRepository;

@Service
@Transactional
public class CursosServices {

	private CursoRepository cursoRepository;
	@Autowired
	public CursosServices(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	public List<Curso> getCursos(){
		return cursoRepository.findAll();
	}
	public Curso getCurso(String code) {
		return cursoRepository.findCursoByCode(code);
	}
}
