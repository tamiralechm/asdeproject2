package com.pegasoft.spandashboard.model;

public class Choices {

	public static int id;

	private int qid = Questions.id;

	/* the actual answer choice content
	 * 
	 */
	private String content;

	/*
	 * among the available choice list mark each correct or incorrect
	 * 
	 */
	private String[] status = { "correct", "incorrect" };

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Choices.id = id;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}
	
	
	

}
