package com.learnSphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.learnSphere.entities.Users;
import com.learnSphere.services.UsersService;
import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController {

	@Autowired
	UsersService uservice;

	@PostMapping("/addUser")
	public String addUser(@ModelAttribute Users user) {
		String email = user.getEmail();
		boolean isPresent = uservice.checkEmail(email);
		if (isPresent == false) {
			uservice.adduser(user);
		} else {
			System.out.println("Email already present");
		}

		return "login";
	}

	@PostMapping("/validateUser")
	public String validateUser(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, Model m) {

		Users user = uservice.findUserByEmail(email);

		String dbPassword = user.getPassword();

		String role = user.getRole();

		if (password.equals(dbPassword)) {

			session.setAttribute("loggedInUser", user);

			m.addAttribute("user", user);

			if (role.equals("Trainer"))

				return "trainerHome";

			else

				return "studentHome";
		} else {
			return "login";
		}
	}
}