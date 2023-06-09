package com.aps.app.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aps.app.allRepo.UserAllRepo;
import com.aps.app.dao.UserDAO;
import com.aps.app.entity.Users;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private UserAllRepo userRepo;
	@Override
	public Users registerUser(Users users) {
		// TODO Auto-generated method stub
		return userRepo.registerUserRepo(users);
	}
	@Override
	public Users  getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.getUserByEmail(email);
	}

}
