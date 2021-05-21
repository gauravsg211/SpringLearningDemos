package com.devglan.springsecurityldap.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/users").hasRole("ADMIN")
				.anyRequest().authenticated()
				.and().httpBasic();
	}
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
	      .dataSource(dataSource)
	      .usersByUsernameQuery("select email,password,enabled "
	        + "from bael_users "
	        + "where email = ?")
	      .authoritiesByUsernameQuery("select email,authority "
	        + "from authorities "
	        + "where email = ?");
	}

	private PasswordEncoder passwordEncoder() {
		final BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return bcrypt.encode(rawPassword.toString());
			}
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return bcrypt.matches(rawPassword, encodedPassword);
			}
		};
	}

	@Bean
	public BCryptPasswordEncoder bcryptEncoder() {
		return new BCryptPasswordEncoder();
	}

}
