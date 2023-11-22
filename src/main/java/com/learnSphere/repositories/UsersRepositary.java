package com.learnSphere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entities.Users;

public interface UsersRepositary extends JpaRepository<Users, Integer> {

	Users findByEmail(String email);
	boolean existsByEmail(String email);
}
