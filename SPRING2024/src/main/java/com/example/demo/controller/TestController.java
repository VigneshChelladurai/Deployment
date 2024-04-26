package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		
		return "vicky";
		
	}
	
//	way 1 lomok -> slf4j -> access
//	way 2 log 4j -> create instance -> acces ( logger log = logmanager.getlogger(classname.class))
//	way 3 slf4j -> create instance -> access ( logger log = loggerfdactory.getlogger(Classname.class))

//	easy way -> create instance directly -> access ( logger log = logger.getlogger(classname.class.getname()));
	

}
