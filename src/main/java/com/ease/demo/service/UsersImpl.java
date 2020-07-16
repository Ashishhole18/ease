package com.ease.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ease.demo.entity.UserFeedback;
import com.ease.demo.entity.Users;
import com.ease.demo.repo.UserFeedbackRepo;
import com.ease.demo.repo.UserRepository;

@Service
public class UsersImpl implements UsersService {

	@Autowired
	UserRepository usrRepo;
	
	@Autowired
	UserFeedbackRepo userFeed;
	

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usrRepo.findAll();
	}


	@Override
	public boolean AddFeedback(UserFeedback fd) {
		// TODO Auto-generated method stub
		
		UserFeedback feed=userFeed.save(fd);
		return feed!=null?true:false;
	}


	@Override
	public List<UserFeedback> getAllFeedback() {
		
		return userFeed.findAll();
	}

}
