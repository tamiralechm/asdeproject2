package com.pegasoft.spandashboard.model;

import java.util.List;

public class Questions {

	public static int id;

	private int course_id = Courses.id;

	private int exam_id = Exam.id;

	/* actual question content
	 * 
	 */
	private List<String> question_content;

	/* the associated mark of each question
	 * 
	 */
	private List<Integer> points;

	/* question can be choice type,description or workout type
	 * 
	 */
	private String[] question_type = { "essay", "choice" };

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public List<String> getQuestion_content() {
		return question_content;
	}

	public void setQuestion_content(List<String> question_content) {
		this.question_content = question_content;
	}

	public List<Integer> getPoints() {
		return points;
	}

	public void setPoints(List<Integer> points) {
		this.points = points;
	}

	public String[] getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String[] question_type) {
		this.question_type = question_type;
	}

}
