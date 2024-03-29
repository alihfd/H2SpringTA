package com.fdmgroup.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fdmgroup.model.User;

public interface IUserDao extends JpaRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.userName = ?1 AND u.password = ?2")
    User getUser(String username, String password);

}
