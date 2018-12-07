package com.pegasoft.spandashboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the user database table.
 * 
 */
@Table(name="user")
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {

	//private static final long serialVersionUID = 1L;
	
 
	@Column(name = "fName")
	private String firstName;

	@Column(name = "lName")
	private String lastName;

	@Column
	private String email;

	@Column(name = "codiceFiscale")
	private String codiceFiscale;

	@OneToMany(targetEntity=User.class, fetch=FetchType.EAGER)
	@Column(name = "userType")
	private String userType;
	
	//private String[] userTypes= {"admin","Student","professor"};

	//@Lob
	@Id
	public static int userId;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	 
//	public String[] getUserTypes() {
//		return userTypes;
//	}
//
//	public void setUserTypes(String[] userTypes) {
//		this.userTypes = userTypes;
//	}

	public static int getUserId() {
		return userId;
	}

	public static void setUserId(int userId) {
		User.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	 
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}

}