package com.aps.app.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aps.app.allRepo.UserAllRepo;
import com.aps.app.entity.Users;
import com.aps.app.services.UserServices;

@Service
@Transactional
public class UserServiceImpl implements UserServices {
	
	@Autowired
	private UserAllRepo allRepo;
	
	@Override
	public Users registerUser(Users users) {
		if(users!=null) {
			return allRepo.registerUserRepo(users);
		}
		return null;
	}

}
