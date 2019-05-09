package com.bmw.dwh.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmw.dwh.bean.User;
import com.bmw.dwh.mapper.UserMapper;

/**
 * 用户接口实现
 * @author luoshengsha
 *
 * 2016年5月12日-下午2:44:32
 */
@Service
//@Cacheable(value="my-ehcache")
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserMapper mapper;
	
	static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
	
	static {
		users.put(1l,new User(1l,"user1","pwd1"));
		users.put(2l,new User(2l,"user2","pwd2"));
		users.put(3l,new User(3l,"user3","pwd3"));
	}
	@Override
	public void save(User user) {
		mapper.save(user);
	}

	//@CacheEvict(value="my-ehcache",key="#user.getName()")
	@Override
	public void update(User user) {
		mapper.update(user);
	}

	//@Cacheable(value="my-ehcache")
	@Override
	public User find(Long id) {
		return users.get(id);
		//return mapper.find(id);
	}

	//@Cacheable(value="my-ehcache")
	@Override
	public List<User> query() {
		List<User> lst = new ArrayList<>();
		for(Long key:users.keySet()) {
			lst.add(users.get(key));
		}
		return lst;
		//return mapper.query();
	}

}
