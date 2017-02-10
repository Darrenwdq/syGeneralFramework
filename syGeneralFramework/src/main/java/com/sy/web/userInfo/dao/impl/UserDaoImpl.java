package com.sy.web.userInfo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sy.commons.persistence.dao.BaseDao;
import com.sy.commons.persistence.dao.impl.EntityDaoSupport;
import com.sy.commons.pojo.User;
import com.sy.web.userInfo.dao.UserDao;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:Dao实现类主要是放SQL语句的查询
 */
@Repository
public class UserDaoImpl extends EntityDaoSupport<User> implements UserDao,BaseDao {

	@Autowired
	private JdbcTemplate druidJDBCTemplate;

/*	public int queryUser(User user) {
		String sql = simpleSqlBuilder.getQueryAllSql();
		Map<String, Object> map = druidJDBCTemplate.queryForMap("SELECT count(*) id FROM USER WHERE username ='" + user.getUsername() + "' AND PASSWORD ='" + user.getDescribe() + "'");
		System.out.println(map.get("id"));
		return Integer.valueOf(map.get("id").toString());
	}*/
	
	
	public int queryUser(User user) {
		String sql = "SELECT count(*) id FROM USER WHERE username = ? AND PASSWORD = ?";
		Object[] obj = {user.getUsername(), user.getDescribe() };
		System.out.println(user.getUsername() + user.getDescribe());
//		try {
//			List userList = search(sql, obj);
//		} catch (DaoAccessException e) {
//			e.printStackTrace();
//		}
		return druidJDBCTemplate.queryForInt(sql, obj);
	}

	public int register() {
		System.out.println("这是注册！");
		return 0;
	}
	

}
