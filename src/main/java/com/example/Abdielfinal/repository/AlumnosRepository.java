package com.example.Abdielfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Abdielfinal.model.Alumno;



@Repository
public interface AlumnosRepository extends JpaRepository<Alumno, Long> {
	
@Query(value = "select * from alumnos where dni = ?1" , nativeQuery = true)
Alumno getAlumnoByDni(String dni);
}

