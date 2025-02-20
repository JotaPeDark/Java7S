package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createBook(createUserDto createUserDto){
        new UserRepository()
    }

}
