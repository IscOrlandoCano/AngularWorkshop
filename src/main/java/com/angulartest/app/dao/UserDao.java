package com.angulartest.app.dao;

import com.angulartest.app.model.User;

public interface UserDao {

	User findByUserName(String username);

}
