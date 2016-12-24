package com.sy.web.userInfo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.web.userInfo.services.UserService;

@Controller
public class UserLogin {
	private static Logger logger = Logger.getLogger(UserLogin.class);
	@Autowired UserService userService;

	@RequestMapping("login")
	private String login() {
		System.out.println("test");
		 userService.getAll();
		logger.info("进入登录页面方法");
		return "login";
	}
}
