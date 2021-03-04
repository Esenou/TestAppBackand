package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User creatUser(UserModel userModel) {
        User user = new User();
        user.setUsername(userModel.getUsername());
        user.setPassword(userModel.getPassword());
        user.setRoles(userModel.getRoles());
       // user.setUserStatus(userModel.getUserStatus());
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, UserModel userModel) {
        User user = findById(id);
        user.setUsername(userModel.getUsername());
        user.setPassword(userModel.getPassword());
        user.setRoles(userModel.getRoles());
        user.setUserStatus(userModel.getUserStatus());
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("Not found!!"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAllByUsername(String username,Pageable pageable) {
        return userRepository.findAllByUsername(username,pageable);
    }
}
