package com.example.learningjavaspringapibasics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message{
    private String id;
    private String name;
    private String message;
}
