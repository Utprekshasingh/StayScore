package com.Icwd.user.service.UserService.service;

import java.util.List;

import com.Icwd.user.service.UserService.entities.User;

public interface UserService {
	
	//user operations
	
	//create
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get single user of given userId
	User getUser(String userId);
	
	//delete
	//update

}
