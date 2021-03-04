package com.example.demo.model;

import com.example.demo.enums.Role;
import com.example.demo.enums.UserStatus;
import lombok.*;

import javax.xml.crypto.Data;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private Long id;
    private Role roles;
    private String username;
    private String password;
    private UserStatus userStatus;
    private Data createdDate;
}
