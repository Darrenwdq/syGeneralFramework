package com.sy.web.userInfo.services.impl;

import java.util.List;
import java.util.Map;

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
public class UserServiceImpl implements UserService  {

	@Autowired UserDao userDao;
	
	public List<Map<String, Object>> getAll() {
		return userDao.getAll();
	}

}
