package com.trendyol.jsonlogger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(path = "test")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello World");
    }
}
