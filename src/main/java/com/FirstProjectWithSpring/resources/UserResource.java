package com.FirstProjectWithSpring.resources;

import com.FirstProjectWithSpring.entities.User;
import com.FirstProjectWithSpring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource
{
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAllUsers()
    {
        List<User> users = service.findAllUsers();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<User> findById(@PathVariable  Long Id) {
        User user = service.findById(Id);

        return ResponseEntity.ok().body(user);
    }
}


