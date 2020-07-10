package com.ease.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ease.demo.entity.Users;
import com.ease.demo.repo.UserRepository;

@Service
public class UsersImpl implements UsersService {

	@Autowired
	UserRepository usrRepo;
	

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usrRepo.findAll();
	}

}
