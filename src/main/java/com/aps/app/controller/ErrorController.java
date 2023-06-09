package com.aps.app.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/error")
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	
	@RequestMapping("/error")
	public ModelAndView handleError(HttpServletRequest request) {
	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	    
	    if (status != null) {
	        Integer statusCode = Integer.valueOf(status.toString());
	    
	        request.setAttribute("status_code", statusCode);
	    }
	    return new ModelAndView("Error");
	}
}
