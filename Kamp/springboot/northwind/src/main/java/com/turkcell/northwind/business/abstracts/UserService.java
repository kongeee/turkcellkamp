package com.turkcell.northwind.business.abstracts;

import com.turkcell.northwind.business.dtos.UserDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    UserDto createUser(UserDto userDto);

    UserDto getUserDetailsByEmail(String email);
    
}
