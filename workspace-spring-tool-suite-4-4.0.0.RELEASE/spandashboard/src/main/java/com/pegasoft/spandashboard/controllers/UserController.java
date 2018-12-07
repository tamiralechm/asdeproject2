package com.pegasoft.spandashboard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pegasoft.spandashboard.model.User;
import com.pegasoft.spandashboard.repos.UserRepository;
import com.pegasoft.spandashboard.services.UserServices;

@Controller
public class UserController {
	
	public  UserServices userServices;

	@RequestMapping("/index")
	public String index() {
		//System.out.println("hi");
		return "index";
	}
	
}
