package com.arquitecturajava.oodesign;

import java.util.Objects;

public class Beca {
	
	private int id;
	private double importe;
	private Alumno alumno;
	
	public Beca() {
		super();
	}

	public Beca(int id, double importe, Alumno alumno) {
		super();
		this.id = id;
		this.importe = importe;
		this.alumno = alumno;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
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
		Beca other = (Beca) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Beca [id=" + id + ", importe=" + importe + "]";
	}

}
