package com.example.learningjavaspringapibasics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class GreetingController {
    private ArrayList<Message> messages = new ArrayList<>();


    @GetMapping("/hello")
    public String greetWorld() {
        return "Hello, World!";
    }

    @GetMapping("hello/{name}")
    public String greetWorld(@PathVariable String name) {
        return "Hello, " + name +"!";
    }

    @PostMapping("/messages")
    public ArrayList<Message> addMessage(@RequestParam String id, @RequestParam String name, @RequestParam String message) {
        messages.add(new Message(id,name,message));
        return messages;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }
}
