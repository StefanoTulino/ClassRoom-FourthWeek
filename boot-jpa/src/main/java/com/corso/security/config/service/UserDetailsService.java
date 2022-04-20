package com.corso.security.config.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService {
    UserDetails loadBySurname(String s);

}
