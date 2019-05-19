package com.edu.spring.springboot;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
public class BookController {

    @ExceptionHandler(value = FileNotFoundException.class)
    public String error(Exception e) {
        return "file not found exception" + e.getMessage();
    }

    @GetMapping("/book/error1")
    public String error1() throws FileNotFoundException {
        throw new FileNotFoundException("book.txt not found");
    }

    @GetMapping("/book/error2")
    public String error2() throws ClassNotFoundException {
        throw new ClassNotFoundException("book.class not found");
    }

}
