package com.tech.dao;

import com.tech.bean.Login;
import com.tech.bean.User;

public interface UserDao {
	 int register(User user);

	  User validateUser(Login login);
}
