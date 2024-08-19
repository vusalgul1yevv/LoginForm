package com.company.loginform.service.impl;

import com.company.loginform.dto.UserDTO;
import com.company.loginform.entity.User;
import com.company.loginform.repository.UserRepository;
import com.company.loginform.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(User user){
        userRepository.save(user);
        return new UserDTO(user.getName(),user.getLastname(),user.getEmail());
    }
}
