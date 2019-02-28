package com.highlion.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.highlion.dao.UserEntityMapper;

public class Test02 {
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //SpringContextHolder.printAllBeans();
		UserEntityMapper userEntityMapper=ac.getBean(UserEntityMapper.class);
		System.out.println("--->"+ac.getBean(UserEntityMapper.class));
		System.out.println(userEntityMapper.findByUsernameAndPassword("admin","admin"));
	}

}
