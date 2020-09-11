package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tech.bean.Login;
import com.tech.bean.User;
import com.tech.dao.UserDao;



public class UserServiceImpl implements UserService {

	  @Autowired
	  public UserDao userDao;

	  public int register(User user) {
	    return userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

}
