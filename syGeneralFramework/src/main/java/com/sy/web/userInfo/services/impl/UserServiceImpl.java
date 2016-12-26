package com.sy.web.userInfo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.web.userInfo.dao.UserDao;
import com.sy.web.userInfo.services.UserService;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

	@Autowired UserDao userDao;


	@Override
	public Boolean queryUser() {
		int count = userDao.queryUser();
		System.out.println(count);
		if (count != 0)
			return true;
		else
			return false;
	}
	
	public Boolean register() {
		int count = userDao.queryUser();
		
		return false;
	}

}
