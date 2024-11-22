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

    public UserRepository load;

    public UserRepository buffer;

    public UserRepository pause;

    public UserRepository uhd;

    public UserRepository quality;

    public UserRepository qualify;

    public UserRepository qualified;

    public UserRepository book;

    public UserRepository chapter;

    public UserDetailsImp(UserRepository repository) {
        this.repository = repository;
    }
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }
}
