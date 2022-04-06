package com.turkcell.northwind.api.controllers;

import com.turkcell.northwind.business.abstracts.UserService;
import com.turkcell.northwind.business.dtos.UserDto;
import com.turkcell.northwind.core.utilities.results.Result;
import com.turkcell.northwind.core.utilities.results.SuccessResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    
    private UserService userService;
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
	public Result add(@RequestBody UserDto userDto) { 
		this.userService.createUser(userDto);
        return new SuccessResult();
	}
}
