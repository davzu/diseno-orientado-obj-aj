package com.arquitecturajava.oodesign.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.oodesign.Alumno;

class AlumnoTest {

	@Test
	void test() {
		Alumno alumno = new Alumno("123A");
		assertEquals("123A", alumno.getDni());
	}
	
	@Test
	void edadTest() {
		Alumno alumno = new Alumno("123A", "Pedro", "Pérez", LocalDate.of(2000, 1, 1));
		assertEquals("123A", alumno.getDni());
		assertEquals(22, alumno.getEdad());
	}
	
	@Test
	void igualdadTest() {
		Alumno alumno1 = new Alumno("123A");
		Alumno alumno2 = new Alumno("123A");
		Alumno alumno3 = new Alumno("123B");
		assertEquals(alumno1, alumno2);
		assertNotEquals(alumno1, alumno3);
	}
	
	@Test
	void esMayorEdadTest() {
		Alumno alumno = new Alumno("123A", "Pedro", "Pérez", LocalDate.of(2000, 1, 1));
		assertTrue(alumno.esMayorEdad());
	}

}
