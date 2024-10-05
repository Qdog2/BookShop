package com.example.springJwt.service;

import com.example.springJwt.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService {

    private static final UserRepository repository = null;
    public UserRepository user;
    public UserRepository password;

    public UserRepository email;

    public UserRepository account;

    public UserRepository admin;

    public UserRepository moderator;

    public UserRepository role;

    public UserRepository application;

    public UserRepository job;

    public UserRepository username;

    public UserRepository security;

    public UserRepository question;

    public UserRepository answer;

    public UserRepository paragraph;

    public UserRepository essay;

    public UserRepository thesis;

    public UserRepository intro;

    public UserDetailsImp(UserRepository repository) {
        this.repository = repository;
    }
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }
}
