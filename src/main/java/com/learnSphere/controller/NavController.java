package com.learnSphere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/addC")
	public String addC() {
		return "addCourse";
	}
	@GetMapping("/newLesson")
	public String newLesson() {
		return "newLesson";
	}
	@GetMapping("/studentHome")
	public String studentHome() {
		return "studentHome";
	}
	@GetMapping("/logout")
	public String logout() {
		return "index";
	}
}
