package com.highlion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.highlion.dao.UserEntityMapper;
import com.highlion.entity.User;
import com.highlion.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserEntityMapper userEntityMapper;
	/*@Autowired
	private UserMapper userMapper;*/
	@Override
	public User findById(int id) {
		return userEntityMapper.selectByPrimaryKey(id);
	}
	@Override
	public User findByUserNameAndPassword(String username, String password) {
		
		return userEntityMapper.findByUsernameAndPassword(username, password);
	}
	

}
