package com.FirstProjectWithSpring.services;

import com.FirstProjectWithSpring.entities.User;
import com.FirstProjectWithSpring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAllUsers(){
        return repository.findAll();
    }

    public User findById(Long Id){
        Optional<User> obj = repository.findById(Id);
        return obj.get();
    }
}
