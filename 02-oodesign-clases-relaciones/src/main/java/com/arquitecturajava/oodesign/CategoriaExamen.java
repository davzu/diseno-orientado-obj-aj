package com.arquitecturajava.oodesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CategoriaExamen {
	
	private String nombre;
	private String descripcion;
	private List<Examen> examenes = new ArrayList<Examen>();
	
	public CategoriaExamen() {
		super();
	}
	
	public CategoriaExamen(String nombre) {
		super();
		this.nombre = nombre;
	}

	public CategoriaExamen(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public void addExamen(Examen examen) {
		examenes.add(examen);
	}
	
	public void removeExamen(Examen examen) {
		examenes.add(examen);
	}
	
	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaExamen other = (CategoriaExamen) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "CategoriaExamen [nombre=" + nombre + "]";
	}
	
	

}
