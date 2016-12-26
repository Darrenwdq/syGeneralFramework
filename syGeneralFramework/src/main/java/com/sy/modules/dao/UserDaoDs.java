package com.sy.modules.dao;

import java.util.List;
import java.util.Map;

import com.sy.commons.persistence.dao.EntityDao;
import com.sy.modules.pojo.User;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
public interface UserDaoDs extends EntityDao<User> {

	
	public 	List<Map<String, Object>> getAll();
}
