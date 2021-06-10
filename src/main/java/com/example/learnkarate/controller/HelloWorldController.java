package com.example.learnkarate.controller;

import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/test")
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/by-name")
    public String helloName(@RequestParam String name) {
        return "Hello " + name;
    }

    @SneakyThrows
    @PostMapping
    public ResponseEntity<String> save(@RequestBody TestDto testDto) {
        return ResponseEntity.ok("Hello " + testDto.getName());
    }


}
