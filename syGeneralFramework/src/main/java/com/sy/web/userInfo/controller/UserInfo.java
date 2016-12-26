package com.sy.web.userInfo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.web.userInfo.services.UserService;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:该类是写User的一些方法
 */

@Controller
public class UserInfo {
	@Autowired
	UserService userService;// 通过注解的方式注入

	private static final Logger logger = Logger.getLogger(UserInfo.class);

	@RequestMapping("login")
	private String login() {
		System.out.println("test");
		Boolean isTrue = userService.queryUser();
		logger.info("进入登录页面方法");
		return "userInfo/login";
	}

	@RequestMapping("register")
	private String register() {
		System.out.println("test");
		Boolean isTrue = userService.register();
		logger.info("进入登录页面方法");
		return "userInfo/login";
	}
}
