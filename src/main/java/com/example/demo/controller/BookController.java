package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody CreateBookDto createBookDto){
        bookService.createBook(createBookDto);
        return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Book> getBookById(@PathVariable("userId") String  userId){
        return null;
    }

}
