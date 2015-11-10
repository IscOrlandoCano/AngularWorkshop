package com.angulartest.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.angulartest.app.model.Alumno;


@Repository
public class AlumnosDaoImpl implements AlumnosDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Alumno> find() {
		List<Alumno> alumnos = new ArrayList<>();
        Transaction tx = null;
        Session session = sessionFactory.openSession();
        try {
            tx = session.beginTransaction();
            alumnos = session.createQuery("from Alumno").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return alumnos;
	}

	@Override
	public Alumno load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno persist(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno merge(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno delete(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
