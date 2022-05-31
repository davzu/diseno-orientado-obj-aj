package com.arquitecturajava.oodesign;

import java.time.LocalDate;

public class Principal {
	
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.setNombre("Pedro");
		System.out.println(alumno.getNombre());
		
		Alumno alumno2 = new Alumno("123A", "Juan", "Gómez", LocalDate.now());
		System.out.println(alumno2.toString());
	}
	

}
