package com.Maheshwar.SecureApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class RegistrationController {
    @Autowired
	private UserRepository repo;
    
    @Autowired
    PasswordEncoder encoder;
    
    @PostMapping("/signup/user")
	public MyUser createUser(@RequestBody MyUser user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
    @PostMapping("/register/user")
	public MyUser newUser( MyUser user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
}
