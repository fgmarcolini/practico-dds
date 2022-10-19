package com.grupo2b.dds.tp.controller;

import java.util.ArrayList;

import com.grupo2b.dds.tp.model.Competencia;
import com.grupo2b.dds.tp.model.Empresa;
import com.grupo2b.dds.tp.model.Puesto;
import com.grupo2b.dds.tp.model.PuntajeCompetencia;
import com.grupo2b.dds.tp.dao.CompetenciaDAOImpl;
import com.grupo2b.dds.tp.dao.EmpresaDAOImpl;
import com.grupo2b.dds.tp.dao.PuestoDAOImpl;
import com.grupo2b.dds.tp.dto.PuestoDTO;

public class GestionPuesto {
	
	// PuestoDTO -> Integer
	// crea un Puesto dado un PuestoDTO desde la interfaz AltaPuesto.
	public Integer darAltaPuesto(PuestoDTO puestoDTO) {
		
		Boolean validacion = this.validarDatos(puestoDTO);
		if(!validacion) {
			// error
			return null;
		}
		
		Puesto puesto = new Puesto();
		puesto.setNombre(puestoDTO.getNombre());
		puesto.setCodigo(puestoDTO.getCodigo());
		puesto.setDescripcion(puestoDTO.getDescripcion());
		
		Empresa empresa = (new EmpresaDAOImpl()).getByID(puestoDTO.getIdEmpresa());
		puesto.setEmpresa(empresa);
		
		ArrayList<Integer> competencias = puestoDTO.getCompetencias();
		ArrayList<Integer> ponderaciones = puestoDTO.getPonderaciones();
		
		for(int i = 0; i < competencias.size(); i++) {
			Competencia c  = (new CompetenciaDAOImpl()).getByID(competencias.get(i));
			PuntajeCompetencia pc = new PuntajeCompetencia(c, ponderaciones.get(i));
			puesto.addPuntajeCompetencia(pc);
		}
		
		Integer idPuesto = (new PuestoDAOImpl()).createPuesto(puesto);
		return idPuesto;
		
	}
	
	// PuestoDTO -> Boolean
	// retorna true si los datos de puestoDTO son correctos.
	private Boolean validarDatos(PuestoDTO puestoDTO) {
		// no hecho
		return true;
	}

}
