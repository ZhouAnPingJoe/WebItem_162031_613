package webadv3.WebItem.zap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.dao.UserDao;
import webadv3.WebItem.zap.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	//��֤�û���������
	@Override
	public User validUser(User user) {
		return userDao.findByAccountAndPasswordAndType(user.getAccount(), user.getPassword(), user.getType());
	}
	//ע��
	@Override
	public void InsertUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	
	

}
