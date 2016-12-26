package com.sy.modules.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sy.commons.persistence.dao.impl.EntityDaoSupport;
import com.sy.modules.dao.UserDaoDs;
import com.sy.modules.pojo.User;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
@Repository
public class UserDaoImplDs extends EntityDaoSupport<User> implements UserDaoDs {

	public List<Map<String, Object>> getAll() {
		List<Map<String, Object>> search=null;
		System.out.println("走着了没？大爷");
		 try {
			String sql = simpleSqlBuilder.getQueryAllSql();
			
			  search = search(sql, new Object[]{});
			//list = search(sql, UserDao.class, new Object[]{});
			//search(sql, mapRowMapper, params)
			return search;
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return search;
	}
}
