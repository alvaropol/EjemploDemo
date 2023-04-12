package com.example.demo; 

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

@Repository
public class AlmacenAlumnos {

	List<Alumno> lista;

	@PostConstruct
	public void init() {			
		lista = new ArrayList<Alumno>();
		
		lista.add(Alumno.builder() //Este add es mejor que poner new Alumno(...);
				.nombre("Alvaro Polonio")
				.fechaNac(LocalDate.of(2004, 4, 12))
				.edad(22)
				.build());
		
	}
	
	public List<Alumno> findAll(){
		return Collections.unmodifiableList(lista);
	}
	
}
