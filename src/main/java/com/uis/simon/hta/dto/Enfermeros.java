package com.uis.simon.hta.dto;

public class Enfermeros {
	
	private String nombre;
	
	private String apellido;
	
	private String cc;

	public Enfermeros() {}
	
	public Enfermeros(String nombre, String apellido, String cc) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cc = cc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}
	
	

}