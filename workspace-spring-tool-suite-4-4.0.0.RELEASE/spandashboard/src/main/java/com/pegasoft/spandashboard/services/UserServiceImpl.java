package com.pegasoft.spandashboard.services;

import java.util.List;

import com.pegasoft.spandashboard.model.User;
import com.pegasoft.spandashboard.repos.UserRepository;

public class UserServiceImpl implements UserServices {

	
	private UserRepository userRepository;
		
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		
	}

	@Override
	public User getUserById(Long userId) {
 		return userRepository.getOne(userId);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers(User user) {
		return userRepository.findAll();
	}


	

	
}
