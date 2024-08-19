package com.company.loginform.service;
import com.company.loginform.dto.UserDTO;
import com.company.loginform.entity.User;

import java.util.List;

public interface UserService {
    UserDTO createUser(User user);

}
