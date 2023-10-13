package com.example.learningjavaspringapibasics;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String greetWorld() {
        return "Hello, World!";
    }

    @GetMapping("hello/{name}")
    public String greetName(@PathVariable String name) {
        return "Hello, " + name +"!";
    }
}
