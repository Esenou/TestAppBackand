package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    User creatUser(UserModel userModel);
    User updateUser(Long id,UserModel userModel);
    void deleteById(Long id);
    User findById(Long id);
    List<User> findAll();
    Page<User> findAllByUsername(String username, Pageable pageable);
}
