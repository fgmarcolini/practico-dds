package com.grupo2b.dds.tp.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Puesto {
	
	@Id
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "activo")
	private Boolean activo;
	
	// Relaciones
	private Empresa empresa;
	private ArrayList<Evaluacion> evaluaciones;
	private ArrayList<PuntajeCompetencia> competencias;
	
	// constructor sin args
	public Puesto() {
		super();
		this.activo = true;
		this.evaluaciones = new ArrayList<Evaluacion>();
		this.competencias = new ArrayList<PuntajeCompetencia>();
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Evaluacion> getEvaluaciones() {
		return evaluaciones;
	}
	
	public void addEvaluacion(Evaluacion e) {
		this.evaluaciones.add(e);
	}

	public ArrayList<PuntajeCompetencia> getCompetencias() {
		return competencias;
	}
	
	public void addPuntajeCompetencia(PuntajeCompetencia p) {
		this.competencias.add(p);
	}
	
	
	
}
