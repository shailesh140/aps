package com.aps.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String roleName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "roles",fetch = FetchType.LAZY)
	private List<UsersRole> userRoleList;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UsersRole> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UsersRole> userRoleList) {
		this.userRoleList = userRoleList;
	}

	

	
	
}
