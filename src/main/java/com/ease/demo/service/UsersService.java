package com.ease.demo.service;

import java.util.List;

import com.ease.demo.entity.UserFeedback;
import com.ease.demo.entity.Users;

public interface UsersService {
	
	List<Users> getAllUsers();
	boolean AddFeedback(UserFeedback fd);
	List<UserFeedback> getAllFeedback();

}
