package com.aps.app.common.object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.aps.app.entity.Users;


public class CustomeUsersDetails implements UserDetails{
	
	
	
	private static final long serialVersionUID = 1L;
	
		@Autowired
		private Users users;
		
		
	
	//Spring security Details....
	
		public CustomeUsersDetails(Users users) {
			this.users = users;
		}
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			List<Authority> listAuthority=new ArrayList<Authority>();
			this.users.getUserRoleList().forEach(role->{
				listAuthority.add(new Authority(role.getRoles().getRoleName()));
			});
			return listAuthority;
		}
		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return this.users.getEmail();
		}
		
	
		
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return this.users.isAccountNonExpired();
		}
		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return this.users.isAccountNonLocked();
		}
		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return this.users.isCredentialsNonExpired();
		}
		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return this.users.isEnabled();
		}
		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return users.getPassword();
		}
		
}
