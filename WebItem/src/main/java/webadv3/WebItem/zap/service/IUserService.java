package webadv3.WebItem.zap.service;

import webadv3.WebItem.entity.User;

public interface IUserService {

	//��֤�û���������
	User validUser(User user);
	
	//ע�����û�
	void InsertUser(User user);
}
