package webadv3.WebItem.zap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import webadv3.WebItem.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	User findByAccountAndPasswordAndType(String account,String password,String type);
	
	
	@Query(value="update user set password =?1 where account=?2",nativeQuery=true)
	@Modifying
	void updatePassword(String password, String account);
}

