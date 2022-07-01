package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	@ResponseBody
	@RequestMapping("/cricketBat")
	public String giveCricketBat()
	{
		return "Here is your Cricket Bat..Take it";
	}

}
