package com.highlion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.highlion.entity.User;
import com.highlion.service.UserService;

@Controller
@RequestMapping("/page/user/")
public class LoginController {
	@Autowired
	private UserService userService;
@RequestMapping("/toLogin.action")
  public String toLogin() {
	System.out.println("---");
	  return "login";
  }
@RequestMapping("/login.action")
  public String login(@RequestParam(name="name")String username,@RequestParam(name="pwd")String password) {
	System.out.println(username+":"+password);
	User user=userService.findByUserNameAndPassword(username, password);
	if(user==null) {
		return "login";
	}
	  return "menu";
  }
}
