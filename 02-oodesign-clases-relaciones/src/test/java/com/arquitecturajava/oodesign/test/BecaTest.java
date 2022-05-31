package com.arquitecturajava.oodesign.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.oodesign.Alumno;
import com.arquitecturajava.oodesign.Beca;

class BecaTest {

	@Test
	void becaConAlumnoTest() {
		Alumno alumno = new Alumno("1", "Pedro", "Gómez", LocalDate.now());
		Beca beca = new Beca(1, 2000, alumno);
		assertEquals(alumno, beca.getAlumno());
		
		alumno.setBeca(beca);
		assertEquals(alumno.getBeca(), beca);
	}

}
