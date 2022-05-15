package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String greeting()
	{
		return "Hello World !";
	}
	
	@RequestMapping(value="hello", method=RequestMethod.POST)
	public String greetingfrompost()
	{
		return "Hello World !";
	}
}
