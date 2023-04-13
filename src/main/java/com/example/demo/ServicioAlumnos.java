package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServicioAlumnos {

	
	@Autowired // Autowired satisface la dependecia que tiene ServicioAlumnos de AlmacenAlumnos
	//@Qualifier("almacenAlumnosMemoria")
	private AlmacenAlumnos almacenAlumnos;

	/**
	 * Método que de vuelve una lista de nombres de aquellos que cumple años hoy
	 * 
	 * @return lista de nombres, lista vacía si no hay ninguno.
	 */
	public List<String> cumpleHoy() {
		List<String> result = new ArrayList<String>();

		result = almacenAlumnos.findAll()
				.stream()
				.filter(x -> x.getFechaNac().getDayOfMonth() == LocalDate.now().getDayOfMonth()
						&& x.getFechaNac().getMonth() == LocalDate.now().getMonth())
				.map(x -> x.getNombre())
				.toList();

		return result;
	}

}
