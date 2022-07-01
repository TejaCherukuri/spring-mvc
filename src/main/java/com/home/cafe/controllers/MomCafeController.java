package com.home.cafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MomCafeController {
	
	@RequestMapping("/cafe")
	public String welcomePage()
	{
		return "welcome-page-to-cafe";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(Model model, HttpServletRequest request)
	{
		//Taking the data entered by user and sending it to the view using Model class
		String foodType = request.getParameter("foodType");
		model.addAttribute("foodType", foodType);
		
		return "process-order-view";
	}
}
