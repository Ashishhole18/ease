package com.ease.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ease.demo.entity.UserFeedback;
import com.ease.demo.entity.Users;
import com.ease.demo.service.UsersService;

@RestController
@RequestMapping("users")
@CrossOrigin(origins="*",allowedHeaders = "*")
public class UsersController {
	
	@Autowired
	UsersService srv;
	
	@GetMapping("getAllFeedback")
	public List<UserFeedback> getAllFeedBack(){
		return srv.getAllFeedback();
	}
	@GetMapping("getallUsers")
	public List<Users> allUsers()
	{
		return srv.getAllUsers();
		
	}
	
	@PostMapping("comment")
	boolean AddFeedback(@RequestBody UserFeedback entity)
	{
		System.out.println(entity);
		return srv.AddFeedback(entity);
		
	}

}
