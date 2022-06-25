package com.m25.service;

import com.m25.app.form.LoginForm;

public class LoginImpl implements LoginService {

	private LoginForm loginForm;
	
	@Override
	public String login() {
		System.out.println("Get username and password !");
		return loginForm.getUserName() + loginForm.getPassword();
	}

	@Override
	public String getLoginForm() {
		return loginForm.toString();
	}
	

}
