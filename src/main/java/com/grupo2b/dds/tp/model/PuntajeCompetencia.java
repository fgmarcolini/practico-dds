package com.grupo2b.dds.tp.model;

public class PuntajeCompetencia {
	private Integer ponderacion;
	private Competencia competencia;

	public PuntajeCompetencia(Competencia competencia, Integer ponderacion) {
		// TODO Auto-generated constructor stub
		super();
		this.competencia = competencia;
		this.ponderacion = ponderacion;
	}
	
}
