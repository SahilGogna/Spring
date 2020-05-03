package com.spring.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springweb.dao.UserRepo;
import com.spring.springweb.model.User;

@Controller 
public class WebController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		repo.save(user);
		return "home.jsp";
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam int uid) {
		ModelAndView mv = new ModelAndView("showUser.jsp");
		User user = repo.findById(uid).orElse(new User());
		mv.addObject(user);
		return mv;
	}
	
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam int uid) {
		repo.deleteById(uid);
		return "home.jsp";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		repo.deleteById(user.getUid());
		repo.save(user);
		return "home.jsp";
	}
	
	@RequestMapping("/getCustomData")
	public String getCustomData() {
		System.out.println(repo.findByUname("Java"));
		System.out.println(repo.findByUidGreaterThan(102));
		System.out.println(repo.findByUnameSorted("Java"));
		return "home.jsp";
	}

}
