package com.angulartest.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angulartest.app.dao.AlumnosDao;
import com.angulartest.app.model.Alumno;

@Service
public class AlumnosServiceImpl implements AlumnosService{

	@Autowired
	private AlumnosDao alumnosDao;
	
	@Override
	public List<Alumno> find() {
		return alumnosDao.find();
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
