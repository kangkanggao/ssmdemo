package com.highlion.service;

import org.springframework.stereotype.Service;

import com.highlion.entity.User;
@Service
public interface UserService {
   User findById(int id);
   User findByUserNameAndPassword(String username,String password);
}
