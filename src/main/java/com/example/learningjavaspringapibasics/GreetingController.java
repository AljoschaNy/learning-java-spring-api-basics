package com.example.learningjavaspringapibasics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    /*@PostMapping("/messages")
    public void addMessage(@RequestParam String id, @RequestParam String name, @RequestParam String message) {
        messages.add(new Message(id,name,message));
    }*/

    @PostMapping("/messages")
    public void addMessage(@RequestBody Message message) {
        messages.add(message);
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @DeleteMapping("/messages/{id}")
    public void removeMessage(@PathVariable String id) {
        for(Message message: messages) {
            if(message.getId().equals(id)) {
                messages.remove(message);
            }
        }
    }
}
