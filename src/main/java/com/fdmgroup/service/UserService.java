package com.fdmgroup.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.dao.IUserDao;
import com.fdmgroup.model.User;

@Service
public class UserService {

	private static List<User> users = new ArrayList<>();
	
	private IUserDao userDao;
	
	@Autowired
	public UserService(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	/*
	 * static{ users.add(new User("alihfd", "Password", "alihfd@gmail.com"));
	 * users.add(new User("aylinhfd", "Password2", "aylinhfd@gmail.com")); }
	 */
	public List<User> getAllUsers(){
		return users;
	}
	
	public User addUser(User user) {
		return this.userDao.save(user);
	}
	
	/*
	 * public User getUser(String username) { User qResult = new User();
	 * EntityManager em = con.getEntityManager(); em.getTransaction().begin();
	 * TypedQuery<User> q = em.createNamedQuery("u.findUserByName", User.class);
	 * q.setParameter("uName", username); try { qResult = q.getSingleResult();
	 * }catch(Exception e) { System.out.println("BAKLAAAAa"); qResult = null; }
	 * em.close(); if(qResult != null) { return qResult; } return null; }
	 */
}
