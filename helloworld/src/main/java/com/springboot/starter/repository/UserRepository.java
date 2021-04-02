package com.springboot.starter.repository;

import com.springboot.starter.entity.UserModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier(value = "usersRepository")
public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserModel findByEmail(String email);


}
