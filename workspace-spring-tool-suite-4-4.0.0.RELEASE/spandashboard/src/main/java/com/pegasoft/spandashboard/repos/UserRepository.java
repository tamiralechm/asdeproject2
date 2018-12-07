 package com.pegasoft.spandashboard.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pegasoft.spandashboard.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
