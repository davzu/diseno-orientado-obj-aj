package com.arquitecturajava.oodesign.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.oodesign.CategoriaExamen;
import com.arquitecturajava.oodesign.Examen;

class ExamenTest {

	@Test
	void categoriaExamenTest() {
		Examen examen = new Examen(1);
		CategoriaExamen categoriaExamen = new CategoriaExamen("Final", "Examen final");
		examen.addCategoriaExamen(categoriaExamen);
		
		assertTrue(examen.getCategoriasExamenes().contains(categoriaExamen));
	}

}
