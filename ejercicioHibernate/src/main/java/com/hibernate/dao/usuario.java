package com.hibernate.dao;

import javax.persistence.*;


@Entity
@Table(name="usuario", schema="public")
public class usuario {
	
	//Definicion de atributos
	@Id
	@Column(name="id", unique=true, nullable=false)
	private Integer id;
	@Column(name="nombre",nullable=false)
	private String nombre;
	@Column(name="apellidos",nullable=false)
	private String apellidos;
	@Column(name="edad",nullable=false)
	private Integer edad;
	@Column(name="correo",nullable=false)
	private String correo;
	
	//Constructores
	public usuario(Integer id, String nombre, String apellidos, Integer edad, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.correo = correo;
	}

	public usuario() {
		super();
	}

	//Getters y setters
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", correo="
				+ correo + "]";
	}
	
	
	
	 
}
