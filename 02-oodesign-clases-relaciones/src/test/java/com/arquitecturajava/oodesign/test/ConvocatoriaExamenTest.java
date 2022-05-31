package com.arquitecturajava.oodesign.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.oodesign.ConvocatoriaExamen;
import com.arquitecturajava.oodesign.Examen;

class ConvocatoriaExamenTest {

	@Test
	void test() {
		ConvocatoriaExamen convocatoria = new ConvocatoriaExamen();
		List<Examen> examenes = new ArrayList<Examen>();
		examenes.add(new Examen(1, "Matemáticas", 7, convocatoria));
		examenes.add(new Examen(2, "Lengua", 7, convocatoria));
		convocatoria.setExamenes(examenes);
		convocatoria.removeExamen(new Examen(1));
		
		assertFalse(convocatoria.getExamenes().contains(new Examen(1)));
		assertTrue(convocatoria.getExamenes().contains(new Examen(2)));
	}
	
	@Test
	void notaMediaConvocatoriaTest() {
		ConvocatoriaExamen convocatoria = new ConvocatoriaExamen();
		List<Examen> examenes = new ArrayList<Examen>();
		examenes.add(new Examen(1, "Matemáticas", 5, convocatoria));
		examenes.add(new Examen(2, "Lengua", 3, convocatoria));
		convocatoria.setExamenes(examenes);
		
		assertEquals(4, convocatoria.getNotaMedia());
	}

}
