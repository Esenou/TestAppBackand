package com.example.demo.controller.auth;


import com.example.demo.model.AuthRequest;
import com.example.demo.model.AuthResponse;
import com.example.demo.model.UserCreate;
import com.example.demo.model.UserModel;
import com.example.demo.service.auth.AuthService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signin")
    public  AuthResponse login(@RequestBody AuthRequest user){

        return new AuthResponse(authService.signin(user.getUsername(),user.getPassword()));
    }

    @PostMapping("/signup")
    public String signup(@RequestBody UserCreate user) {
        return authService.signup(user);
    }




}
