package com.angulartest.app.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "student")
public class Alumno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 625946868566225951L;
	private Long id;
	private String firstName;
	private String lastName;
//	private Set<Materia> materias = new HashSet<>();
	
	
	
	public Alumno() {
		super();
	}
	public Alumno(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
//		this.materias = materias;
	}
	@Id
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name = "student_subjects", joinColumns = { 
//			@JoinColumn(name = "ID_STUDENT", nullable = false, updatable = false) }, 
//			inverseJoinColumns = { @JoinColumn(name = "ID_SUBJECT", 
//					nullable = false, updatable = false) })
//	public Set<Materia> getMaterias() {
//		return materias;
//	}
//	public void setMaterias(Set<Materia> subjects) {
//		this.materias = subjects;
//	}

}
