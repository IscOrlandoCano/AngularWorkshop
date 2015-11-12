package com.angulartest.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.angulartest.app.model.Materia;


@Repository
public class MateriasDaoImpl implements MateriasDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Materia> find() {
		List<Materia> materias = new ArrayList<>();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            materias = session.createQuery("from Materia").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return materias;
	}

	@Override
	public Materia load(Long id) {
		Session session = sessionFactory.openSession();
		Materia materia = null;
        try {
            session.beginTransaction();
            materia = (Materia) session.get(Materia.class, id);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return materia;
	}

	@Override
	public Materia persist(Materia materia) {
		Transaction tx = null;
        Session session = sessionFactory.openSession();
        try {
            tx = session.beginTransaction();
            session.persist(materia);
            tx.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch(Exception e){
        	e.printStackTrace();
        	throw e;
        }finally {
            session.flush();
            session.close();
        }
		return materia;
	}

	@Override
	public Materia merge(Materia materia) {
		Transaction tx = null;
        Session session = sessionFactory.openSession();
        try {
            tx = session.beginTransaction();
            session.merge(materia);
            tx.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch(Exception e){
        	e.printStackTrace();
        	throw e;
        }finally {
            session.flush();
            session.close();
        }
		return materia;
	}

	@Override
	public Materia delete(Materia materia) {
		Transaction tx = null;
        Session session = sessionFactory.openSession();
        try {
            tx = session.beginTransaction();
            session.delete(materia);
            materia = null;
            tx.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch(Exception e){
        	e.printStackTrace();
        	throw e;
        }finally {
            session.flush();
            session.close();
        }
		return materia;
	}
	
	
	
}
