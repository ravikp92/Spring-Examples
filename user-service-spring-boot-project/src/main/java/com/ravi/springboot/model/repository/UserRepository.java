package com.ravi.springboot.model.repository;

import java.util.List;

import com.ravi.springboot.model.User;

public interface UserRepository {

	public List<User> retreivAllUsers();
}
