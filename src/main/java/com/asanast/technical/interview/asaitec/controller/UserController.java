package com.asanast.technical.interview.asaitec.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/users")
public class UserController {


    @GetMapping("/useroperator")
    public ResponseEntity<?> getAvaliableOperators() {
        return ResponseEntity.ok("OK");
    }
}
