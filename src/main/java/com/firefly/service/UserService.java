package com.firefly.service;

import java.util.List;

import com.firefly.domain.User;

public interface UserService {
	public User getUserById(String string); 
	
	public void addUser(User user);
	
	public User getUserByName(String name);

	public List getAllUser();

	public void userActive(User user);

}
