package com.ravi.springboot.model.repository;

import java.util.ArrayList;
import java.util.List;

import com.ravi.springboot.model.User;

public class InMemoryUserRepositoryImpl implements UserRepository {

	
	private static List<User> users=new ArrayList<User>();
	
	static {
		users.add(new User(1, "ravi", "ravi@t.com", "1234568589"));
		users.add(new User(2, "puri", "puri@t.com", "3569875123"));
	}
	
	public List<User> retreivAllUsers() {
		return users;
	}
	
}
