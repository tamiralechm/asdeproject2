package com.pegasoft.spandashboard.model;

import java.util.List;

public class Department {
	
	public static int id;
	private String department_name;
	private int course_id=Courses.id;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Department.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
  	 
}
