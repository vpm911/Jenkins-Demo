package com.vishal.integration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJenkins {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok().body("Hello There!");
    }
}

