package com.highlion.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highlion.dao.UserEntityMapper;
import com.highlion.entity.User;


public class Test1 {
	private static  Logger logger = (Logger) LoggerFactory.getLogger(Test1.class);
	@Autowired
	private static UserEntityMapper user;
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		 User us=  user.selectByPrimaryKey(1);
	
		 System.out.println(us.getUsername());
	}

}
