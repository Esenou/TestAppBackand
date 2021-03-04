package com.example.demo.service.auth;

import com.example.demo.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface AuthService {
    String signin(String username, String password);
    String refresh(String username);
}
