package com.pegasoft.spandashboard.model;

import java.util.Date;

public class Result {

	public static int id;

	private int student_id = Student.id;

	private int exam_id = Exam.id;

	private double score;

	/*
	 * after taking the exams the system will evaluate and catagorize student as
	 * passed or failed
	 */
	private String[] student_status = { "passed", "failed" };
	// private Date posted_at;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Result.id = id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String[] getStudent_status() {
		return student_status;
	}

	public void setStudent_status(String[] student_status) {
		this.student_status = student_status;
	}
	
	

}
