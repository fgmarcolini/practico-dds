package com.grupo2b.dds.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grupo2b.dds.tp.model.Competencia;

public class CompetenciaDAOImpl implements CompetenciaDAO {

	@Override
	public Integer createCompetencia(Competencia competencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompetencia(Competencia competencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Competencia> getAllCompetencias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateCompetencia(Competencia competencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Competencia getByID(Integer idCompetencia) {
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Competencia.class);
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();    	
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	Competencia competencia = session.get(Competencia.class, idCompetencia);
    	session.getTransaction().commit();
    	
		return competencia;
	}

}
