package com.example.demo.controller;

import com.example.demo.enums.Role;
import com.example.demo.enums.UserStatus;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/creat")
    User creat(@RequestBody UserModel user){
        return userService.creatUser(user);
    }
    @PutMapping("/update/{id}")
    User update(@RequestBody UserModel user, @PathVariable("id") Long id){
        return userService.updateUser(id,user);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id")Long id){
        userService.deleteById(id);
    }
    @GetMapping("findById/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }
    @GetMapping("/findAll")
    public List<User> findALl(){
        return userService.findAll();
    }

    @GetMapping("/findAllByUsername")
    public Page<User> findAllByUsername(@RequestParam(value = "searchResult", required = false) String username,@PageableDefault(2) Pageable pageable){
          return userService.findAllByUsername(username,pageable);
    }



}
