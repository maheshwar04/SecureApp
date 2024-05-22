package com.Maheshwar.SecureApp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home(){
		return "home";
	}
	@GetMapping("/register")
	public String register(){
		return "signup";
	}
	@GetMapping("/login")
	public String login(){
		return "signin";
	}
	@GetMapping("/login/payment")
	public String payment(){
		return "payment";
	}

}
