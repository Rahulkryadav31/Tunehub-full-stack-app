package com.example.sbwebproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebproject.entity.Users;

public interface UsersRepository extends 
JpaRepository<Users, Integer> {
	public Users findByEmail(String email);

}
