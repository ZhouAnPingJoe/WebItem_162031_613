package webadv3.WebItem.zap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.dao.UserDao;
import webadv3.WebItem.zap.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	//验证用户名和密码
	@Override
	public User validUser(User user) {
		return userDao.findByAccountAndPasswordAndType(user.getAccount(), user.getPassword(), user.getType());
	}
	//注册
	@Override
	public void InsertUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
	@Override
	public void changePassword(String password ,String  account) {
		// TODO Auto-generated method stub
		userDao.updatePassword(password, account);
	}

	
	

}
