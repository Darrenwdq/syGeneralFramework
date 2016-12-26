package com.sy.web.userInfo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.modules.pojo.User;
import com.sy.web.userInfo.dao.UserDao;
import com.sy.web.userInfo.services.UserService;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:Services实现类，写一些业务逻辑
 */
@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public Boolean queryUser(User user) {
		int count = userDao.queryUser(user);
		System.out.println(count);
		if (count != 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean register() {
		int count = userDao.register();
		return false;
	}

}
