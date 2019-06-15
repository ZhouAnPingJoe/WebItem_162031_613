package webadv3.WebItem.zap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webadv3.WebItem.entity.Propertyadmin;

@Repository
public interface PropertyadminDao extends JpaRepository<Propertyadmin, Long>{
	
	//��ѯ��ҵ����Ա�Ļ�����Ϣ
	Propertyadmin findByAccountAndPassword(String account,String password);
    
	
}
