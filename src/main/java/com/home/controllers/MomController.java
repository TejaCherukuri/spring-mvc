package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody	// Used to store the return value in HTTP Response 
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		return "Here is your sugar..Take it";
	}
	
	// The below method return View (Not recommended practice)
	
	@RequestMapping("/sugarview1")
	public String giveSugarView1()
	{
		return "/WEB-INF/view/sugar-view.jsp"; 	// This is not a good practice to specify full physical location of your view. 
												//What if you have to change your folder placement or extension of your file for some other view tech like html/thymeleaf
	}
	
	// The below method return View (Not recommended practice)
	
	@RequestMapping("/sugarview2")
	public String giveSugarView2()
	{
		return "sugar-view";		// All the physical path of the view will be taken care by ViewResolver we configure in DispatcherServlet
								// ViewResolver adds prefix and suffix to the name we pass (Here SugarView) 
	}
		
	
}
