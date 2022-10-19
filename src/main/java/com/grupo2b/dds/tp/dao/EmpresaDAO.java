package com.grupo2b.dds.tp.dao;

import java.util.List;

import com.grupo2b.dds.tp.model.Empresa;

public interface EmpresaDAO {
	public Integer createEmpresa(Empresa empresa);

	public void deleteEmpresa(Empresa empresa);

	public List<Empresa> getAllEmpresas();

	public Integer updateEmpresa(Empresa empresa);

	public Empresa getByID(Integer idEmpresa);
}
