package webadv3.WebItem.zap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import webadv3.WebItem.entity.Propertyadmin;

@Repository
public interface PropertyadminDao extends JpaRepository<Propertyadmin, Long>{
	
	//��ѯ��ҵ����Ա�Ļ�����Ϣ
	Propertyadmin findByAccountAndPassword(String account,String password);
    
	//�޸�����
	@Query(value="update propertyadmin set password =?1 where account=?2",nativeQuery=true)
	@Modifying
	void updatePassword(String password, String account);
	
}
