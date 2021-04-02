package com.springboot.starter.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

    @Entity
    public class UserModel implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long PK;
        @Column(nullable = false)
        @NotEmpty(message = "*Please provide your name")
        public String Name;
        @Column(unique=true,nullable = false)
        @Email(message = "*Please provide a valid Email")
        @NotEmpty(message = "*Please provide an email")
        public String email;
        @Column(unique=true,nullable = false)
        public String mobile;
/*
        public Date DoB;
*/
        @Column(nullable = false)
        @Length(min = 5, message = "*Your password must have at least 5 characters")
        @NotEmpty(message = "*Please provide your password")
        @org.springframework.data.annotation.Transient
        public String password;
        public String gender;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

/*
        public Date getDoB() {
            return DoB;
        }

        public void setDoB(Date doB) {
            DoB = doB;
        }
*/

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

