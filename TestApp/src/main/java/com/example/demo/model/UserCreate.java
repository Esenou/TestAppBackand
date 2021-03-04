package com.example.demo.model;

import com.example.demo.enums.Role;
import com.example.demo.enums.UserStatus;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreate {
    private Role roles;
    private String username;
    private String password;
    private UserStatus userStatus;
}
