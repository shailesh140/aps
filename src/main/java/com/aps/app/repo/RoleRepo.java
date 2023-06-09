package com.aps.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aps.app.entity.Roles;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Integer> {
	
	@Query("from Roles where roleId =:roleId")
	public Roles getRoles(int roleId);

	
	

}
