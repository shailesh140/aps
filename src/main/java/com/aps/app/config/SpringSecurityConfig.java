package com.aps.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.aps.app.servicesImpl.CustomeUserServicesImpl;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {
	
	@Autowired
	private CustomeUserServicesImpl userServiceImpl;
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http
		.authorizeHttpRequests((requests) -> requests
			.antMatchers("/","/home","/getSignup","/registration").permitAll()
			.antMatchers("/users").authenticated()
		)
		.securityContext((securityContext) -> securityContext
                .requireExplicitSave(false))
		.formLogin((form) -> form
			.loginPage("/signin")
			.loginProcessingUrl("/loginCheck")
			.usernameParameter("email")
			.passwordParameter("password")
			.defaultSuccessUrl("/users/dashboard")
			.permitAll()
		)
		.logout((logout) -> logout.permitAll())
		.httpBasic();
		

	return http.build();
	
	}
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider getAuthenticationManager() {
		DaoAuthenticationProvider daoAuthentication=new DaoAuthenticationProvider();
		daoAuthentication.setUserDetailsService(this.userServiceImpl);
		daoAuthentication.setPasswordEncoder(this.passwordEncoder());
		return daoAuthentication;
	}
	
	@Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception { 
        return authenticationConfiguration.getAuthenticationManager();
    }
	
	@Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("classpath:resources/static/assets/**");
    }
	
	
	
}
