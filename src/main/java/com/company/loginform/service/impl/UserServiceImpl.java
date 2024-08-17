package com.company.loginform.service.impl;

import com.company.loginform.dto.UserDto;
import com.company.loginform.entity.User;
import com.company.loginform.repository.UserRepository;
import com.company.loginform.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public User createUser(User user){

        return userRepository.save(user);

    }
}
