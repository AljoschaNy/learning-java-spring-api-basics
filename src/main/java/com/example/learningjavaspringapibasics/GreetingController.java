package com.example.learningjavaspringapibasics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {
    private final List<Message> messages = new ArrayList<>();

    @GetMapping("/hello")
    public String greetWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String greetWorld(@PathVariable String name) {
        return "Hello, " + name +"!";
    }

    @PostMapping("/messages")
    public Message addMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @DeleteMapping("/messages/{id}")
    public void removeMessage(@PathVariable String id) {
        messages.removeIf(message -> message.getId().equals(id));
    }
}
