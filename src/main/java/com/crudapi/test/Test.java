package com.crudapi.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test 
{
	@GetMapping("/index")
	public String test()
	{
		return "index";
	}
}
