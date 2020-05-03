package com.spring.springweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springweb.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
}
