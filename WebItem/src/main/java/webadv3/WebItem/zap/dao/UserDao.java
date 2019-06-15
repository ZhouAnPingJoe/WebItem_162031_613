package webadv3.WebItem.zap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import webadv3.WebItem.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	User findByAccountAndPasswordAndType(String account,String password,String type);
}

