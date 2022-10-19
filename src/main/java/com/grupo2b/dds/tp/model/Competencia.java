package com.grupo2b.dds.tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competencia {
	
	@Id
	@Column(name = "codigo")
	private Integer codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	// private ArrayList<Factor> factores;

}
