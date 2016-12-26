package com.sy.web.userInfo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sy.modules.pojo.User;
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

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	private String login(User user, ModelMap modelMap) {
		String returnStr = "userInfo/login";
		logger.info(user.getUsername() + " 进入登录页面方法");
		Boolean isTrue = userService.queryUser(user);
		if (isTrue) {
			logger.info("登录成功");
			returnStr = "success";
		} else {
			logger.info("登录失败");
			returnStr = "userInfo/login";
		}
		return returnStr;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	private String viewUser() {
		String returnStr = "userInfo/login";
		return returnStr;
	}

	@RequestMapping("register")
	private String register() {
		String returnStr = "userInfo/register";

		logger.info("进入注册方法");
		Boolean isTrue = userService.register();
		if (isTrue) {
			logger.info("注册成功");
			returnStr = "userInfo/login";
		} else {
			logger.info("注册失败");
			returnStr = "userInfo/register";
		}
		return returnStr;
	}
}
