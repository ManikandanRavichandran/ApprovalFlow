package com.tech.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tech.bean.ApprovalBean;
import com.tech.bean.User;
import com.tech.service.UserService;

public class ApporavalController {
  public int iRate;
  ApprovalBean A = new ApprovalBean();
  
  
  iRate = A.getInterstRate();
		  
		  
		  
		  
	 @Autowired
	  public UserService userService;

	  @RequestMapping(value = "/validate", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("validate");
	    return mav;
	    if(iRate>12)
	    {
	    	 mav = new ModelAndView("Role1");
	    	 return mav;
	    }
	    else if((iRate<=13) && (iRate>=14))
	    {
	    	mav = new ModelAndView("Role2");
	    	return mav;
	    }
	    
	    else
	    {
	    	mav = new ModelAndView("Role3and4");
	    	return mav;
	    }
	    
	  }
	
	
}
