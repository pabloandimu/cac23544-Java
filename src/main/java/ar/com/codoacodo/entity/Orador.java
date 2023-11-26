package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class Orador {
	//atributos - encapsulamiento private
	private Long id;
	private String nombre;
	private String apellido;
	private String mail;
	private String tema;
	private LocalDate fechaAlta;
	
	//constructor/es
	//usar cuando voy a enviar un objeto a la DB
	//forma mágica de Construir (alt + shift + s)
	
	public Orador(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		init(nombre, apellido, mail, tema, fechaAlta);
		// selecciono las lineas que se repiten y alt + shift + m
	}

	public Orador(Long id, String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.id = id;
		init(nombre, apellido, mail, tema, fechaAlta);
	}
	
	private void init(String nombre, String apellido, String mail, String tema, LocalDate fechaAlta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail; 
		this.tema = tema;
		this.fechaAlta = fechaAlta;
	}

	//otra forma de polimorfismo: SOBREESCRITURA, un metodo que existe en una clase base (java.lang.Object)
	//pero su hijo lo cambia

	public String toString() {
		return "Orador [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", tema="
				+ tema + ", fechaAlta=" + fechaAlta + "]";
	}
	
	//implementar un método llamado toString() - cambiarlo, de la clase Object para ver mas lindos
	//los atributos o datos
	
	//getters/setters
	
	public Long getId() {
		return this.id;
	}
	/*
	public void setId(Long id) {
		this.id = id;
	}
	*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre != null) {
			this.nombre = nombre;
		} else {
			this.nombre = "N/D";
		}
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
	
}
