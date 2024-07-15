package com.projects.apirest.controllers;

import com.projects.apirest.entities.User;
import com.projects.apirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController() {}

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping(value="/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository
                .findById(id)
                .get();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
