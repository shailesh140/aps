package com.aps.app.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//After Login All Display URL handling

@Controller
@RequestMapping(value = "/users")
public class AppraisalViewController {
	
	@GetMapping(value = "/dashboard")
	public String getCountry(Principal principal,HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println(principal);
		return "dashboard";
	}
	

}
