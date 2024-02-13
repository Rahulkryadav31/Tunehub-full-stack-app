package com.example.sbwebproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebproject.entity.PlayList;

public interface PlayListReposotory extends 
JpaRepository<PlayList, Integer> {

}
