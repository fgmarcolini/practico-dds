package com.grupo2b.dds.tp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.grupo2b.dds.tp.model.Empresa;

public class EmpresaDAOImpl implements EmpresaDAO{

	@Override
	public Integer createEmpresa(Empresa empresa) {
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Empresa.class);
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();    	
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	session.save(empresa);
    	session.getTransaction().commit();
    	
		return empresa.getCodigo();
	}

	@Override
	public void deleteEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> getAllEmpresas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empresa getByID(Integer idEmpresa) {
    	//create configuration
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Empresa.class);
    	
    	//create session factory
    	SessionFactory sessionFactory = configuration.buildSessionFactory();    	
    	
    	//initialize the session object
    	Session session = sessionFactory.openSession();
    	
    	session.beginTransaction();
    	Empresa empresa = session.get(Empresa.class, idEmpresa);
    	session.getTransaction().commit();
    	
		return empresa;
	}

}
