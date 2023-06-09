package com.aps.app.dao;

import com.aps.app.entity.Users;

public interface UserDAO {
	
	public Users registerUser(Users users);

	public Users getUserByEmail(String email);

}
