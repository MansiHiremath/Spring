package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;

@Controller       //request processor component
public class UserController {
@Autowired
private UserService userService;
@PostMapping("login")
public String checkLogin(User user,ModelMap map) {
	if(userService.validateUser(user))
	{
		map.addAttribute("usernm",user.getUsername());
		return "welcome";					//logical view name
	}
	else {
		map.addAttribute("logonError", "Invalid username or password");
		return "login";
	}
}
}
