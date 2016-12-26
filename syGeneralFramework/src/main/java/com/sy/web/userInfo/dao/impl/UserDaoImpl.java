package com.sy.web.userInfo.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sy.modules.pojo.User;
import com.sy.web.userInfo.dao.UserDao;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:Dao实现类主要是放SQL语句的查询
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate druidJDBCTemplate;

	public int queryUser(User user) {
		Map<String, Object> map = druidJDBCTemplate
				.queryForMap("SELECT count(*) id FROM USER WHERE username ='"+user.getUsername()+"' AND PASSWORD ='"+user.getDescribe()+"'");
		System.out.println(map.get("id"));
		return Integer.valueOf(map.get("id").toString());
	}

	public int register() {
		System.out.println("这是注册！");
		return 0;
	}

}
