package com.bmw.dwh.mapper;

import java.util.List;

import com.bmw.dwh.bean.User;


public interface UserMapper {

	public void save(User user);
	
	public void update(User user);
	
	public User find(int userId);
	
	public List<User> query();
}
