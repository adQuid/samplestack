package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

	
	//comment just to see if I can commit
	@RequestMapping("/simple")
	public @ResponseBody String simple() {
		return "Hello world!";
	}

}
