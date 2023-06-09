package com.aps.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aps.app.entity.Users;
import com.aps.app.services.UserServices;
import com.aps.app.servicesImpl.CustomeUserServicesImpl;

@Controller
public class CommonController {
	
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private CustomeUserServicesImpl customeUser;
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping(value ="/home")
	public String homePage() {
		return "home";
	}
	
	@GetMapping(value = "/signin")
	public String loginPage(@ModelAttribute("users") Users users,BindingResult result) {
		return "signin";
	}
	
	@GetMapping(value = "/signup")
	public String getSignupForm() {
		return "signup";
	}
	
	@PostMapping(value = "/registration")
	public String registerUser(@ModelAttribute("user") Users user,BindingResult result,HttpServletRequest request) throws Exception {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setAccountNonExpired(true);
		user.setCredentialsNonExpired(true);
		user.setAccountNonLocked(true);
		user.setEnabled(true);
		
		Users result1=userServices.registerUser(user);
		if(result1!=null) {
			request.setAttribute("success", "You are successfully Register......");
			
		}
		else {
			throw new Exception();
		}
		return "redirect:/signin";
	}
	
	
	  @PostMapping(value = "/loginCheck") 
	  public String loginCheck(@ModelAttribute("login") Users login,HttpServletRequest req) throws Exception {
		 
		  UserDetails usersDetail= customeUser.loadUserByUsername(login.getEmail());
		  
		  if(usersDetail!=null) {
			  if(passwordEncoder.matches(login.getPassword(), usersDetail.getPassword())) {
				  System.out.println("you are login Successfully.....");
				  System.out.println("redirect:"+req.getContextPath()+"/users/dashboard");
				    return "redirect:/users/dashboard";
			  }
			  
		  }
		  return "redirect:"+req.getContextPath()+"/login";
//		  res.sendRedirect(req.getContextPath()+"/users/dashboard");
		  
	  }
	  
	  
	 
	
}
