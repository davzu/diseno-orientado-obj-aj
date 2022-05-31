package com.arquitecturajava.oodesign;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConvocatoriaExamen {
	
	private long id;
	private String asignatura;
	private LocalDate fecha;
	public List<Examen> examenes = new ArrayList<Examen>();
	
	public ConvocatoriaExamen() {
		super();
	}
	
	public ConvocatoriaExamen(long id) {
		super();
		this.id = id;
	}

	public ConvocatoriaExamen(long id, String asignatura, LocalDate fecha) {
		super();
		this.id = id;
		this.asignatura = asignatura;
		this.fecha = fecha;
	}
	
	public void addExamen(Examen examen) {
		examenes.add(examen);
	}
	
	public void removeExamen(Examen examen) {
		examenes.remove(examen);
	}
	
	public double getNotaMedia() {
		double total = 0;
		
		for(Examen examen : examenes) {
			total += examen.getNota();
		}
		
		return total/examenes.size();
	}
	
	
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
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
		ConvocatoriaExamen other = (ConvocatoriaExamen) obj;
		return id == other.id;
	}
	
	

}
