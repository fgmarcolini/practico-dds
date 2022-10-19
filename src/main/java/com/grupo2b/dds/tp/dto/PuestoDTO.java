package com.grupo2b.dds.tp.dto;

import java.util.ArrayList;

public class PuestoDTO {
	private Integer codigo;
	private String nombre;
	private Integer idEmpresa;
	private ArrayList<Integer> competencias;
	private ArrayList<Integer> ponderaciones;
	private String descripcion;
	
	public PuestoDTO(String codigo, String nombre, String idEmpresa, ArrayList<Integer> competencias,
			ArrayList<Integer> ponderaciones, String descripcion) {
		super();
		this.codigo = Integer.parseInt(codigo);
		this.nombre = nombre;
		this.idEmpresa = Integer.parseInt(idEmpresa);
		this.competencias = competencias;
		this.ponderaciones = ponderaciones;
		this.descripcion = descripcion;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public ArrayList<Integer> getCompetencias() {
		return competencias;
	}

	public ArrayList<Integer> getPonderaciones() {
		return ponderaciones;
	}

	public String getDescripcion() {
		return descripcion;
	}
	

}
