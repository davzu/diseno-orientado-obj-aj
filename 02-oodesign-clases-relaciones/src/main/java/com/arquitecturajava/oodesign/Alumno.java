package com.arquitecturajava.oodesign;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Alumno {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private Beca beca;
	private Direccion direccion;
	
	public Alumno() {
		super();
	}

	public Alumno(String dni) {
		super();
		this.dni = dni;
	}
	
	public Alumno(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		return periodo.getYears();
	}
	
	public boolean esMayorEdad() {
		return getEdad() >= 18;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Beca getBeca() {
		return beca;
	}

	public void setBeca(Beca beca) {
		this.beca = beca;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
