package com.grupo2b.dds.tp.dao;

import java.util.List;
import com.grupo2b.dds.tp.model.Competencia;

public interface CompetenciaDAO {
	public Integer createCompetencia(Competencia competencia);

	public void deleteCompetencia(Competencia competencia);

	public List<Competencia> getAllCompetencias();

	public Integer updateCompetencia(Competencia competencia);

	public Competencia getByID(Integer idCompetencia);
}
