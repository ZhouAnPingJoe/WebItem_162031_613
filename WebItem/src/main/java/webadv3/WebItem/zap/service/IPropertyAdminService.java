package webadv3.WebItem.zap.service;


import webadv3.WebItem.entity.Propertyadmin;
import webadv3.WebItem.entity.User;


public interface IPropertyAdminService {

	//������ҵ����Ա
	void InsertPropertyadmin(Propertyadmin propertyAdmin);
	//��ѯ��ҵ����Ա�Ļ�����Ϣ
	Propertyadmin getPropertyAdminInfo(User user);
	
	//�޸���ҵ����Ա�Ļ�����Ϣ
	void changePropertyAdminInfo(Propertyadmin propertyadmin);
}
