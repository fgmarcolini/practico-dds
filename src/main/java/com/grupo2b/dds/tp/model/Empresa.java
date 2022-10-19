package com.grupo2b.dds.tp.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa {
	
	//codigo, cuit, nombre, direccion, email, descripcion, telefono
	
	@Id
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "cuit")
	private Integer cuit;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "telefono")
	private Integer telefono;
	
	//private ArrayList<Puesto> puestos;
	

	public Empresa() {
	}

	public Empresa(Integer codigo, Integer cuit, String nombre, String direccion, String email, String descripcion, Integer telefono) {
		super();
		this.codigo = codigo;
		this.cuit = cuit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.descripcion = descripcion;
		this.telefono = telefono;
		//this.puestos = new ArrayList<Puesto>();
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getCuit() {
		return cuit;
	}


	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

/*
	public ArrayList<Puesto> getPuestos() {
		return puestos;
	}


	public void setPuestos(ArrayList<Puesto> puestos) {
		this.puestos = puestos;
	}*/
	
	
}
