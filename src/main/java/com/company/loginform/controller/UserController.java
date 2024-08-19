package com.company.loginform.controller;

import com.company.loginform.dto.UserDTO;
import com.company.loginform.entity.User;
import com.company.loginform.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getAllUsers(){
        return "Hello World";
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTO> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }

}
