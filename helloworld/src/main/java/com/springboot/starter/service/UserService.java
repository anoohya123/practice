package com.springboot.starter.service;

import com.springboot.starter.entity.UserModel;

public interface UserService {
    UserModel findByEmail(String toLowerCase);

    void save(UserModel userModel);
}
