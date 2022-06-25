package com.m25.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m25.app.form.LoginForm;

@Controller
public class LoginController{
	
	//LoginForm
	//To get login form page
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	
	//checking for credentials
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute (name="loginForm") LoginForm loginForm, Model model ) {

		String username = loginForm.getUserName();
		String password = loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			//if 'e girerse daha asagidakileri yapmaz.
			//if username and password is correct, we are returning home page
			return "home"; 
		}
		//if username or password is wrong
		model.addAttribute("invalidCredentials", true);
		// returning again login page
		return "login";
	}
}