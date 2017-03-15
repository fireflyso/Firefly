package com.firefly.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.firefly.dao.UserMapper;
import com.firefly.domain.User;
import com.firefly.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userDao;
	

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addUser(User user) {

		userDao.addUser(user);
	}


	@Override
	public User getUserByName(String name) {
		return userDao.getUserByName(name);
	}


	@Override
	public List getAllUser() {
		return userDao.getAllUser();
	}


	@Override
	public void userActive(User user) {
		
		userDao.userActive(user);
	}

 
}
