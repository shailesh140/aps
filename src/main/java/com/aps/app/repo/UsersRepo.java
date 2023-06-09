package com.aps.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aps.app.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

	@Query(value = "from Users where email =:email")
	public Users getUserByEmail(@Param("email") String email);
	
	

}
