package com.ravi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ravi.springboot.config.ApplicationConfig;
import com.ravi.springboot.services.UserService;
import com.ravi.springboot.services.UserServiceImpl;

@SpringBootApplication
public class MainProgram {

	public static void main(String[] args) {
		ApplicationContext containers=
				SpringApplication.run(ApplicationConfig.class);
		
		UserService userService=containers.getBean(UserService.class);
		userService.retreivAllUsers().forEach(user-> System.out.println(user));
	}
}
