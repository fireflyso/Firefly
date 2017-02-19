package com.firefly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.firefly.domain.User;

public interface UserMapper {
	
	User getUserByName(String name);
	
	
    int insert(User record);


	List getAllUser();


	void userActive(User user);


	void addUser(User user);

}