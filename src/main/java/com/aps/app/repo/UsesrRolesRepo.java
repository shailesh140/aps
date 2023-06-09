package com.aps.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aps.app.entity.UsersRole;

@Repository
public interface UsesrRolesRepo extends JpaRepository<UsersRole, Integer> {
	
	@Query("from UsersRole ur where ur.users.userId =:userId ")
	public List<UsersRole> getUserRoles(int userId);


	

}
