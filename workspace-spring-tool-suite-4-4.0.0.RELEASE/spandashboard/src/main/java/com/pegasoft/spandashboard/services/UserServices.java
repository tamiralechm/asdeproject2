package com.pegasoft.spandashboard.services;

import java.util.List;

import com.pegasoft.spandashboard.model.User;

public interface UserServices {

	
	//CRUD
	User saveUser(User user);

	void deleteUser(User user);

	User getUserById(Long userId);

	User updateUser(User user);
	
	List<User> getAllUsers(User user);
}
