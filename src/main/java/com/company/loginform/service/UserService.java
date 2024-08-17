package com.company.loginform.service;
import com.company.loginform.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
}
