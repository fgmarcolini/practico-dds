package com.grupo2b.dds.tp.dao;

import java.util.List;

import com.grupo2b.dds.tp.model.Puesto;

public interface PuestoDAO {
	public Integer createPuesto(Puesto puesto);

	public void deletePuesto(Puesto puesto);

	public List<Puesto> getAllPuestos();

	public Integer updatePuesto(Puesto puesto);

	public Puesto getByID(Integer idPuesto);
}
