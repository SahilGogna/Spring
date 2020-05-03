package com.spring.springweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.springweb.dao.UserRepo;
import com.spring.springweb.model.User;

@Controller 
public class WebController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/users")
	@ResponseBody
	public List<User> getUsers() {
		return repo.findAll();
	}
	
	@RequestMapping("/user/{uid}")
	@ResponseBody
	public Optional<User> getUser(@PathVariable("uid") int uid) {
		return repo.findById(uid);
	}
	
}
