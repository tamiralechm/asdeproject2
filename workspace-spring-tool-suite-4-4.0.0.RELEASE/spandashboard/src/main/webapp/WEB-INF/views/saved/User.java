package com.pegasoft.spandashboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class User {

	@Id
	private Long userId;

	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String picture;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String fName, String lName, String picture) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.picture = picture;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", picture=" + picture + "]";
	}

}
