package com.aps.app.allRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aps.app.entity.Roles;
import com.aps.app.entity.Users;
import com.aps.app.entity.UsersRole;
import com.aps.app.repo.RoleRepo;
import com.aps.app.repo.UsersRepo;
import com.aps.app.repo.UsesrRolesRepo;

@Repository
public class UserAllRepo {
	@Autowired
	private UsersRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
	private UsesrRolesRepo usersRoleRepo;
	
	public Users registerUserRepo(Users users) {
		Users userData=userRepo.save(users);
		return userData;
		
	}

	public Users getUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		Users users=userRepo.getUserByEmail(email);
		List<UsersRole> userRole=usersRoleRepo.getUserRoles(users.getUserId());
		
	
		users.setUserRoleList(userRole);
		return users;
	}
	
	public Roles saveRoles(Roles roles) {
		return this.roleRepo.save(roles);
		
	}
	
	public UsersRole assignUsersRole(UsersRole usersRole) {
		return this.usersRoleRepo.save(usersRole);
		
	}

}
