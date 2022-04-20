package com.corso.security.config.service;


import com.corso.security.config.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AppUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "User with email %s not found";

      @Autowired
      private AppUserRepository appUserRepository;


    @Override
        public UserDetails loadBySurname(String username) throws UsernameNotFoundException {
        return appUserRepository
                .findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, username)));
        }
    }

