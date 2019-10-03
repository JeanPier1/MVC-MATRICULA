package com.example.Abdielfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Abdielfinal.model.Alumno;
import com.example.Abdielfinal.model.Curso;
import com.example.Abdielfinal.model.DetalleMatricula;
import com.example.Abdielfinal.model.Matricula;
import com.example.Abdielfinal.services.AlumnosService;
import com.example.Abdielfinal.services.CursosServices;
import com.example.Abdielfinal.services.DetalleMatriculasServices;
import com.example.Abdielfinal.services.MatriculasServices;


@RestController
@CrossOrigin(origins = "*")
public class MatriculaController {
	private AlumnosService alumnosService;
	private CursosServices cursosServices;
	private MatriculasServices matriculasServices;
	private DetalleMatriculasServices detalleMatriculasServices;

	@Autowired
	public MatriculaController(AlumnosService alumnosService, CursosServices cursosServices ,MatriculasServices matriculasServices ,DetalleMatriculasServices detalleMatriculasServices ) {
		this.alumnosService = alumnosService;
		this.cursosServices =cursosServices;
		this.matriculasServices =matriculasServices;
		this.detalleMatriculasServices =detalleMatriculasServices;
		
		
	}	
	
	@GetMapping("/getCursos")
	public List<Curso> getCursos(){
		return cursosServices.getCursos();
		
	}

	@GetMapping("/getCurso/{code}")
	public Curso findCursoById(@PathVariable("code")String code) {
		return  cursosServices.getCurso(code);
	}
	@GetMapping("/getAlumnos")
	public List<Alumno> getAlumnos(){
		return alumnosService.getAlumnos();
	}
	@GetMapping("/getAlumno/{dni}")
	public Alumno findAlumnoById(@PathVariable("dni")String dni) {
		return  alumnosService.getAlumno(dni);

	}
	@PostMapping("/doMatricula")
	public Matricula doMatricula(@RequestBody Matricula matricula){
		return matriculasServices.doMatricula(matricula);
	}
	@PostMapping("/detalleMatricula")
	public DetalleMatricula detallesMatricula(@RequestBody DetalleMatricula detalleMatricula) {
		System.out.println(detalleMatricula.toString());
		return detalleMatriculasServices.createDetalle(detalleMatricula);
	}
	
	
}

