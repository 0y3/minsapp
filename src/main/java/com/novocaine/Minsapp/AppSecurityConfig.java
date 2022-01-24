package com.novocaine.Minsapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



@Configurable
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private static final Logger log = LogManager.getLogger();
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		//note
		//use this to enable the tomcat basic authentication (tomcat popup rather than spring login page)
		//note that CSRF token is disableed for all requests
		
		log.info("Disabling CSRF, enabling basic Authentication.....");
		http.csrf().disable()
			.authorizeRequests()
			.antMatchers("/","/index").permitAll() // this url are allowed by any authenticated user
			.anyRequest().authenticated()
			.and()
			.httpBasic();
		
		http.headers()
			.frameOptions()
			.disable();
	}
	
	//@SuppressWarnings("deprecation")
	@Override
	@Bean
	public UserDetailsService userDetailsService() {
		List<UserDetails> users = new ArrayList<UserDetails>();
//		users.add(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("USER","ADMIN").build());
//		users.add(User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build());
		users.add(User.withUsername("admin").password(passwordEncoder().encode("admin")).roles("USER","ADMIN").build());
		users.add(User.withUsername("user").password(passwordEncoder().encode("user")).roles("USER").build());
		return new InMemoryUserDetailsManager(users);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
