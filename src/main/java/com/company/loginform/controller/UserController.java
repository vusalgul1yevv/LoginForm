package com.company.loginform.controller;

import com.company.loginform.dto.UserDto;
import com.company.loginform.entity.User;
import com.company.loginform.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

}
