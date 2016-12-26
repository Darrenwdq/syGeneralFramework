package com.sy.modules.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.commons.persistence.dao.impl.BaseDaoSupport;
import com.sy.modules.dao.UserDaoDs;
import com.sy.modules.service.UserServiceDs;

/**
 * @Author:liangjilong
 * @Date:2015年10月29日-下午3:45:04
 * @Email:jilonglinag@sina.com
 * @Version:1.0
 * @Description:
 */
@Service
@SuppressWarnings("all")
public class UserServiceImplDs  extends BaseDaoSupport  implements UserServiceDs  {

	@Autowired UserDaoDs userDao;
	
	public List<Map<String, Object>> getAll() {
		return userDao.getAll();
	}

}
