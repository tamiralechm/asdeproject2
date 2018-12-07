package com.pegasoft.spandashboard.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table
@Entity
public class Student {

	public static int id;

	@Id
	private int matricola;

 	@Column
	private int department_id = Department.id;

 	@Column
	private int study_year;

	@Column
	private int study_semester;

	@Column
	private int admission_year;

	@OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER)
	@Column
	private List<String> passedExams;

	@OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER)
	@Column
	private List<String> remainingExams;

	@OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER)
	@Column
	private List<Integer> scores;

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getStudy_year() {
		return study_year;
	}

	public void setStudy_year(int study_year) {
		this.study_year = study_year;
	}

	public int getStudy_semester() {
		return study_semester;
	}

	public void setStudy_semester(int study_semester) {
		this.study_semester = study_semester;
	}

	public int getAdmission_year() {
		return admission_year;
	}

	public void setAdmission_year(int admission_year) {
		this.admission_year = admission_year;
	}

	public List<String> getPassedExams() {
		return passedExams;
	}

	public void setPassedExams(List<String> passedExams) {
		this.passedExams = passedExams;
	}

	public List<String> getRemainingExams() {
		return remainingExams;
	}

	public void setRemainingExams(List<String> remainingExams) {
		this.remainingExams = remainingExams;
	}

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}
	
	

}
