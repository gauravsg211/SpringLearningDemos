package com.example.springSecurityDemo.controller.model;

public class AuthRequest {
	
	private String userName;
	private String password;
	
private static final long serialVersionUID = 5926468583005150707L;
	
	
	
	//need default constructor for JSON Parsing
	public AuthRequest()
	{
		
	}

	public AuthRequest(String username, String password) {
		this.setUserName(username);
		this.setPassword(password);
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
