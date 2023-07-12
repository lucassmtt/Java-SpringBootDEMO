package com.example.demo.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.demo.repositories.UserRepository;
import com.example.demo.demo.entities.User;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user01 = new User(null, "João Silva", "joaosilva@gmail.com", "47-99999999", "12345");
        User user02 = new User(null, "Marina Green", "marinagreen@gmail.com", "47-988888888", "12345");

        userRepository.saveAll(Arrays.asList(user01, user02));

    }
}
