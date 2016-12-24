package com.sy.web.userInfo.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sy.web.userInfo.dao.UserDao;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
@Repository
public class UserDaoImpl implements UserDao {

	public List<Map<String, Object>> getAll() {
		System.out.println("这走到了DAO");

		return null;
	}
}
