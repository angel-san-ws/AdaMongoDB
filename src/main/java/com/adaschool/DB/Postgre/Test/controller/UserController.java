package com.adaschool.DB.Postgre.Test.controller;

import com.adaschool.DB.Postgre.Test.mongodb.User;
import com.adaschool.DB.Postgre.Test.mongodb.UsersServiceMongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UsersServiceMongoDb userService;
    public UserController(@Autowired UsersServiceMongoDb userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllUsers(){
        List<User> users = userService.all();
        System.out.println(users.toString());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
/*
    @RequestMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/
}
