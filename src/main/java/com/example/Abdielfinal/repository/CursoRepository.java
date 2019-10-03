package com.example.Abdielfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Abdielfinal.model.Curso;


public interface CursoRepository  extends JpaRepository<Curso, Long>{
	
@Query(value ="select * from cursos where code = ?1 " , nativeQuery = true )
Curso findCursoByCode(String code);
}
