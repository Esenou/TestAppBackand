package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.enums.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {



    @Query(value = "select user FROM  User  user where user.username LIKE %?1%")
    Page<User> findAllByUsername(String username,Pageable pageable);

    User findByUsername(String username);
    User findByPassword(String password);

    //Role findByUsername(String username);

    boolean existsByUsername(String username);

}
