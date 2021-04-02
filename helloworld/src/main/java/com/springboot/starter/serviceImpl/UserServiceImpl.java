package com.springboot.starter.serviceImpl;

import com.springboot.starter.entity.UserModel;
import com.springboot.starter.repository.UserRepository;
import com.springboot.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value="userService")
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository userRepository;
    public UserModel findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void save(UserModel userModel) {
        userRepository.save(userModel);
    }
}
