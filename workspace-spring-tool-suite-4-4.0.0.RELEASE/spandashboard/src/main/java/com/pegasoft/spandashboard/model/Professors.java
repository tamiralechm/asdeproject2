package com.pegasoft.spandashboard.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Professors {
	
	public static int id;
	
 	private int assigned_course=Courses.id;
	
	private int department=Department.id;
	
	private List<Integer> prepared_exams;
	
	private List<String> exam_solutions;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAssigned_course() {
		return assigned_course;
	}

	public void setAssigned_course(int assigned_course) {
		this.assigned_course = assigned_course;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public List<Integer> getPrepared_exams() {
		return prepared_exams;
	}

	public void setPrepared_exams(List<Integer> prepared_exams) {
		this.prepared_exams = prepared_exams;
	}

	public List<String> getExam_solutions() {
		return exam_solutions;
	}

	public void setExam_solutions(List<String> exam_solutions) {
		this.exam_solutions = exam_solutions;
	}
	

}
