package com.angulartest.app.dao;

import java.util.List;

import com.angulartest.app.model.Materia;

public interface MateriasDao {
	List <Materia> find();
	Materia load(Long id);
	Materia persist(Materia materia);
	Materia merge(Materia materia);
	Materia delete(Materia materia);
}
