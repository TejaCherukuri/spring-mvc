package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {

	@ResponseBody
	@RequestMapping("/makeupKit")
	public String giveMakeupKit()
	{
		return "Here is your Makeup kit..Take it";
	}
}
