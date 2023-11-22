package com.learnSphere.services;

import org.springframework.stereotype.Service;

import com.learnSphere.entities.Users;

@Service
public interface UsersService {
	String adduser(Users user);
	Users findUserByEmail(String email);
	boolean checkEmail(String email);
	String saveUsers(Users user);
}
