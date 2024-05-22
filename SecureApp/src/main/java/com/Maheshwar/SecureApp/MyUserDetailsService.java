package com.Maheshwar.SecureApp;

import java.util.Optional;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class MyUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserRepository repo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUser> user = repo.findByEmail(username);
        
        if (user.isPresent()) {
            var userObj = user.get();
            return User.builder()
                    .username(userObj.getEmail())
                    .password(userObj.getPassword())
                    .roles(userObj.getRole())
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found with Email: " + username);
        }
    }
}
