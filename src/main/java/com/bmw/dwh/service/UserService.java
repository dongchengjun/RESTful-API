package com.bmw.dwh.service;

import java.util.List;

import com.bmw.dwh.bean.User;

/**
 * 用户接口
 * @author luoshengsha
 *
 * 2016年5月12日-下午2:02:50
 */
public interface UserService {
	
	public void save(User user);
	
	public void update(User user);
	
	public User find(Long id);
	
	public List<User> query();
}
