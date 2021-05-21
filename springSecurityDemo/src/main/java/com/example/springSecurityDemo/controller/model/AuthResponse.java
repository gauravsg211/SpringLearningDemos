package com.example.springSecurityDemo.controller.model;

public class AuthResponse {
	private String jwtKey;
	
	public AuthResponse(String jwtKey) {
		this.jwtKey=jwtKey;
		
	}
	
	
	public String getJwt() {
		return this.jwtKey;
	}

}
