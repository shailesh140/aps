package com.aps.app.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UsersRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usersRoleId;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "userId",insertable = false, updatable = false)
	private Users users;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "roleId",insertable = false, updatable = false)
	private Roles roles;

	public int getUsersRoleId() {
		return usersRoleId;
	}

	public void setUsersRoleId(int usersRoleId) {
		this.usersRoleId = usersRoleId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	
	

}
