package com.springboot.starter.form;

import java.util.Date;

public class LoginForm {

    public String Name;
    public String email;
    public String mobile;
    public Date DoB;
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

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }

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

    @Override
    public String toString() {
        return "LoginForm{" + "Name='" + Name + '\'' + ", email='" + email + '\'' + ", mobile='" + mobile + '\'' + ", DoB=" + DoB + ", password='" + password + '\'' + ", gender='" + gender + '\'' + '}';
    }
}
