package com.company.loginform.service.impl;

import com.company.loginform.dto.UserDto;
import com.company.loginform.repository.UserRepository;

public class UserServiceImpl {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto createUser(UserDto userDto){
        return (UserDto) userRepository.save(userDto);
    }
}
