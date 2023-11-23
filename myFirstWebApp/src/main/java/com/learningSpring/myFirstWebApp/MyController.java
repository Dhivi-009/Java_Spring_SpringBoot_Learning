package com.learningSpring.myFirstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@Autowired
	private DataAccess dataAccess;
	

	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login_get()
	{
		return "Login";
	}
	
	

	@RequestMapping(value="signin", method=RequestMethod.GET)
	public String signin_get()
	{
		return "Signin";
	}
	
	
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login_post(@RequestParam Long id,
							 @RequestParam String name,
							 @RequestParam String password)
		
	{
		return dataAccess.runLogin(id,name,password);
	}
	
	
	@RequestMapping(value="signin", method=RequestMethod.POST)
	public String signin_post(@RequestParam Long id,
			@RequestParam String name,
			@RequestParam String password,
			@RequestParam String confirmpassword)
	{
		 return dataAccess.runSignin(id,name, password, confirmpassword);
		
		// return "Signin";
	}
	
	
	
	

}
