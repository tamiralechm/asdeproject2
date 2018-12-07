package com.pegasoft.spandashboard.model;

import java.util.Date;

public class Exam {

	public static int id;

	private int course_id = Courses.id;

	private Date exam_date;

	private int department_id = Department.id;

	/*
	 * minimum point needed to pass the exam
	 */
	private int pass_mark;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Exam.id = id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public Date getExam_date() {
		return exam_date;
	}

	public void setExam_date(Date exam_date) {
		this.exam_date = exam_date;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

}
