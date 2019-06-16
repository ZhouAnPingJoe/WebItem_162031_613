package webadv3.WebItem.zap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import webadv3.WebItem.entity.Propertyadmin;

@Repository
public interface PropertyadminDao extends JpaRepository<Propertyadmin, Long>{
	
	//查询物业管理员的基本信息
	Propertyadmin findByAccountAndPassword(String account,String password);
    
	//修改密码
	@Query(value="update propertyadmin set password =?1 where account=?2",nativeQuery=true)
	@Modifying
	void updatePassword(String password, String account);
	
}
