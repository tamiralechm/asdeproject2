package com.pegasoft.spandashboard.model;

public class Courses {
	
	//course model attribute
	public static int id;
	private String course_name;
	private int credit_hours;
	private int assigned_professor=Professors.id;
	private int department=Department.id;
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Courses.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCredit_hours() {
		return credit_hours;
	}
	public void setCredit_hours(int credit_hours) {
		this.credit_hours = credit_hours;
	}
	public int getAssigned_professor() {
		return assigned_professor;
	}
	public void setAssigned_professor(int assigned_professor) {
		this.assigned_professor = assigned_professor;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}

	
	
}
