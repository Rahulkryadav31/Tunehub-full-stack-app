package com.example.sbwebproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebproject.entity.Songs;

public interface SongsRepository extends 
JpaRepository<Songs, Integer> {
	public Songs findByName(String name);

}
