package com.stackroute.userapp.service;

import java.util.List;

import com.stackroute.userapp.model.User;

public interface UserService {
	
	public boolean save(User user);
	public boolean delete(User user);
	public List<User> getalluser();
	

}
