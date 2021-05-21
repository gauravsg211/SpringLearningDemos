package com.example.springSecurityDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springSecurityDemo.controller.model.AuthRequest;
import com.example.springSecurityDemo.controller.model.AuthResponse;
import com.example.springSecurityDemo.controller.util.JwtUtil;

@RestController
@RequestMapping("/security")
@CrossOrigin
public class AuthController {
    private static final Logger log = LoggerFactory.getLogger(AuthController.class);

	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserDetailsService  userDetailsService;
	
	@Autowired
	JwtUtil jwtUtil;
	
	
	@GetMapping("/hello")
	public String hello(){
		return "hello";
		
		
		
	}
	
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public ResponseEntity<?> Authentication(@RequestBody AuthRequest authRequest) throws Exception{
		try {
		
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword()));		}
		
		catch(BadCredentialsException e) {
			log.error("User name and Password is incorrect");
		}
		
		UserDetails userDetails=userDetailsService.loadUserByUsername(authRequest.getUserName());
		final String jwtToken=jwtUtil.GenerateToken(userDetails);
		
		log.info("User: {} is Successfully authenticated and JWT is generated!!!",userDetails.getUsername());
		return ResponseEntity.ok(new AuthResponse(jwtToken));
		
		
				
	}

}
