package com.example.springJwt.service;

import com.example.springJwt.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsImp implements UserDetailsService {
    @Override

    private final UserRepository repository;

    public UserDetailsImp(UserRepository repository) {
        this.repository = repository;
    }
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
