package com.grupo2b.dds.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grupo2b.dds.tp.model.Puesto;

public class PuestoDAOImpl implements PuestoDAO {

	@Override
	public Integer createPuesto(Puesto puesto) {
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Puesto.class);
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();    	
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	session.save(puesto);
    	session.getTransaction().commit();
    	
    	return puesto.getCodigo();
	}

	@Override
	public void deletePuesto(Puesto puesto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Puesto> getAllPuestos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updatePuesto(Puesto puesto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Puesto getByID(Integer idPuesto) {
		// TODO Auto-generated method stub
		return null;
	}

}
