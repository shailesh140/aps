package com.aps.app.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aps.app.allRepo.UserAllRepo;
import com.aps.app.common.object.CustomeUsersDetails;
import com.aps.app.entity.Users;

@Service
public class CustomeUserServicesImpl implements UserDetailsService{
	
	@Autowired
	private UserAllRepo allRepo;
	
	

	
	@SuppressWarnings("unused")
	public UserDetails loadUserByUsername(String email){
		// TODO Auto-generated method stub
		Users user=allRepo.getUserByEmail(email);
		
		CustomeUsersDetails userDetails=new CustomeUsersDetails(user);
		if(userDetails!=null) {
			return userDetails;
		}
		else {
			throw new UsernameNotFoundException("User not found..");
		}
		
	}
	

}
