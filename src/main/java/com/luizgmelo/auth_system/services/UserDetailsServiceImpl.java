package com.luizgmelo.auth_system.services;

import com.luizgmelo.auth_system.models.User;
import com.luizgmelo.auth_system.models.UserDetailsImpl;
import com.luizgmelo.auth_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(email).orElseThrow(() -> new RuntimeException("User not found!"));
        return new UserDetailsImpl(user);
    }
}
