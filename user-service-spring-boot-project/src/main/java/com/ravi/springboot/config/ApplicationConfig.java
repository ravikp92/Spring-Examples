package com.ravi.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ravi.springboot.model.repository.InMemoryUserRepositoryImpl;
import com.ravi.springboot.model.repository.UserRepository;
import com.ravi.springboot.services.UserService;
import com.ravi.springboot.services.UserServiceImpl;

@Configuration
public class ApplicationConfig {

	@Bean
	public UserRepository userRepository() {
		UserRepository userRepository = new InMemoryUserRepositoryImpl();
		return userRepository;
	}
	@Bean
	public UserService userService() {
		UserServiceImpl userservice=new UserServiceImpl();
		userservice.setUserRepository(userRepository());
		return userservice;
	}
}
