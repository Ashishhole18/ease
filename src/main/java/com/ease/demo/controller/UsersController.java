package com.ease.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ease.demo.entity.Users;
import com.ease.demo.service.UsersService;

@RestController
@RequestMapping("users")
@CrossOrigin(origins="*")
public class UsersController {
	
	@Autowired
	UsersService srv;
	
	@GetMapping("getallUsers")
	public List<Users> allUsers()
	{
		return srv.getAllUsers();
		
	}

}
