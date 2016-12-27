package com.sy.web.userInfo.services;

import com.sy.commons.pojo.User;

/**
 * @Author:Darren
 * @Date:2016年12月26日
 * @Version:1.0
 * @Description:services接口
 */

public interface UserService {
	/**
	 * @Description:登录查询
	 * @return
	 */
	public Boolean queryUser(User user);

	/**
	 * @Description:注册信息
	 * @return
	 */
	public Boolean register();
}
