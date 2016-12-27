package com.sy.web.userInfo.dao;

import com.sy.commons.persistence.dao.EntityDao;
import com.sy.commons.pojo.User;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:Dao接口
 */
public interface UserDao extends EntityDao<User>{
	
	public int queryUser(User user);

	public int register();

}
