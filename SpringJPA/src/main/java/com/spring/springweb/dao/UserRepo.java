package com.spring.springweb.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.springweb.model.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
