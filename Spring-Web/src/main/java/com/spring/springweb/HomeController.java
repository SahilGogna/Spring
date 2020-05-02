package com.spring.springweb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		session.setAttribute("name", name);
		return "home";
	}

}
