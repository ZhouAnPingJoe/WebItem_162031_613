package webadv3.WebItem.zap.service;


import webadv3.WebItem.entity.Propertyadmin;
import webadv3.WebItem.entity.User;


public interface IPropertyAdminService {

	//增加物业管理员
	void InsertPropertyadmin(Propertyadmin propertyAdmin);
	//查询物业管理员的基本信息
	Propertyadmin getPropertyAdminInfo(User user);
	
	//修改物业管理员的基本信息
	void changePropertyAdminInfo(Propertyadmin propertyadmin);
}
