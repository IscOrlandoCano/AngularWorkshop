package com.angulartest.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "subjects")
public class Materia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5415155355870604685L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "subject_name")
	private String subjectName;
	@Column(name = "semester")
	private int semester;
//	@Column(name = "ID_STUDENT")
//	private Set<Alumno> alumnos = new HashSet<>();

	
	public Materia() {
		super();
	}
	public Materia(Long id, String subjectName, int semester) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.semester = semester;
//		this.alumnos = alumnos;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
//	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "subjects")
//	public Set<Alumno> getAlumnos() {
//		return alumnos;
//	}
//	public void setAlumnos(Set<Alumno> alumnos) {
//		this.alumnos = alumnos;
//	}

}
