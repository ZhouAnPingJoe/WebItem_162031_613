package webadv3.WebItem.zap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webadv3.WebItem.entity.Propertyadmin;
import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.dao.PropertyadminDao;
import webadv3.WebItem.zap.service.IPropertyAdminService;

@Service
@Transactional
public class PropertyAdminServiceImpl implements IPropertyAdminService {

	@Autowired
	private PropertyadminDao propertyAdminDao;

	// 增加物业管理员
	@Override
	public void InsertPropertyadmin(Propertyadmin propertyAdmin) {
		// TODO Auto-generated method stub
		propertyAdminDao.save(propertyAdmin);
	}
   //查询物业管理员基本信息
	@Override
	public Propertyadmin getPropertyAdminInfo(User user) {
		// TODO Auto-generated method stub
		return propertyAdminDao.findByAccountAndPassword(user.getAccount(), user.getPassword());
	}
    //修改物业管理员信息
	@Override
	public void changePropertyAdminInfo(Propertyadmin propertyadmin) {
		// TODO Auto-generated method stub
		propertyAdminDao.save(propertyadmin);
	}
	//修改物业管理员的密码
	@Override
	public void changePassword(String password, String account) {
		// TODO Auto-generated method stub
		propertyAdminDao.updatePassword(password, account);
	}
	

}
