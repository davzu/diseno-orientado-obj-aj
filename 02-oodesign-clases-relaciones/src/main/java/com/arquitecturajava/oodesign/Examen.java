package com.arquitecturajava.oodesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Examen {

	private long id;
	private String asignatura;
	private double nota;
	private ConvocatoriaExamen convocatoria;
	private List<CategoriaExamen> categoriasExamenes = new ArrayList<CategoriaExamen>();
	
	public Examen() {
		super();
	}
	
	public Examen(long id) {
		super();
		this.id = id;
	}

	public Examen(long id, String asignatura, double nota, ConvocatoriaExamen convocatoria) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.nota = nota;
		this.convocatoria = convocatoria;
	}
	
	public void addCategoriaExamen(CategoriaExamen categoria) {
		categoriasExamenes.add(categoria);
	}

	public void removeCategoriaExamen(CategoriaExamen categoria) {
		categoriasExamenes.remove(categoria);
	}
	
	public List<CategoriaExamen> getCategoriasExamenes() {
		return categoriasExamenes;
	}

	public void setCategoriasExamenes(List<CategoriaExamen> categoriasExamenes) {
		this.categoriasExamenes = categoriasExamenes;
	}

	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

	public ConvocatoriaExamen getConvocatoria() {
		return convocatoria;
	}

	public void setConvocatoria(ConvocatoriaExamen convocatoria) {
		this.convocatoria = convocatoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Examen other = (Examen) obj;
		return id == other.id;
	}
	
	
	

}
