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

public class Users{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String email;
	private String password;
	private String mobile;
	private String firstName;
	private String middleName;
	private String lastName;
	private char gender;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean CredentialsNonExpired;
	private boolean enabled;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "users",fetch = FetchType.LAZY)
	private List<UsersRole> userRoleList;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public boolean isCredentialsNonExpired() {
		return CredentialsNonExpired;
	}
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		CredentialsNonExpired = credentialsNonExpired;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<UsersRole> getUserRoleList() {
		return userRoleList;
	}
	public void setUserRoleList(List<UsersRole> userRoleList) {
		this.userRoleList = userRoleList;
	}
	
	
	
	
}
