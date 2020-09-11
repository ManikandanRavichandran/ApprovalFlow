package com.tech.service;

import com.tech.bean.Login;
import com.tech.bean.User;

public interface UserService {
	int register (User user);

	  User validateUser(Login login);
}
