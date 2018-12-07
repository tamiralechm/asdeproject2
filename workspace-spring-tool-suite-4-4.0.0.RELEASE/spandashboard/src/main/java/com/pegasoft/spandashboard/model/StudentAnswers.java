package com.pegasoft.spandashboard.model;

import java.util.Date;

/*
 * this model consists the attributes of the answers,
 *  that the student provide for the questions
 */
public class StudentAnswers {

	public static int id;
	
	private int qid = Questions.id;
	
	/*
	 * the selected choice among list of choices for the question
	 */
	private int choice = Choices.id;
	
	/*
	 * answer provided for questions other than choice type
	 */
	
	private String essay_type;
	
	private Date updated_at;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		StudentAnswers.id = id;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public String getEssay_type() {
		return essay_type;
	}

	public void setEssay_type(String essay_type) {
		this.essay_type = essay_type;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	

}
