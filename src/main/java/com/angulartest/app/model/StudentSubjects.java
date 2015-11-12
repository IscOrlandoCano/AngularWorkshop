package com.angulartest.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "student")
public class StudentSubjects implements Serializable{

	private static final long serialVersionUID = 1415548680015181614L;
	private Long idStudent;
	private Long idSubject;
	
	public StudentSubjects(){
		
	}
	public StudentSubjects(Long idStudent, Long idSubject) {
		super();
		this.idStudent = idStudent;
		this.idSubject = idSubject;
	}
	public Long getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}
	public Long getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}
	
	
}
