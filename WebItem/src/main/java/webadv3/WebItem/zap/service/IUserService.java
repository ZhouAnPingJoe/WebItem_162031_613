package webadv3.WebItem.zap.service;

import webadv3.WebItem.entity.User;

public interface IUserService {

	//验证用户名和密码
	User validUser(User user);
	
	//注册新用户
	void InsertUser(User user);
}
