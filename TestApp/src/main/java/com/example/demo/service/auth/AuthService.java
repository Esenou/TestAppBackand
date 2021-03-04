package com.example.demo.service.auth;

import com.example.demo.entity.User;
import com.example.demo.model.UserCreate;
import com.example.demo.model.UserModel;

import javax.servlet.http.HttpServletRequest;

public interface AuthService {
    String signin(String username, String password);
    String refresh(String username);
    String signup(UserCreate user);
}
