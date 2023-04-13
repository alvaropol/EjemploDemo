package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlmacenAlumnosArray implements AlmacenAlumnos {

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		Alumno[] lista= new Alumno[] {
				Alumno.builder() //Este add es mejor que poner new Alumno(...);
				.nombre("Alvaro Polonio")
				.fechaNac(LocalDate.of(2004, 4, 13))
				.edad(22)
				.build()
		};
		return Arrays.asList(lista);
		
	}

	
	
}
