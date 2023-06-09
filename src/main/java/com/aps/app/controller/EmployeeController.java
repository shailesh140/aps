package com.aps.app.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/users")
public class EmployeeController {
//	@RequestMapping("/dashboard")
//	public String getCountry(Principal principal,HttpServletRequest request,HttpServletResponse response) {
//		
//		System.out.println(principal);
//		System.out.println("redirect:"+request.getContextPath()+"users/dashboard");
//		return "dashboard";
//	}

}
