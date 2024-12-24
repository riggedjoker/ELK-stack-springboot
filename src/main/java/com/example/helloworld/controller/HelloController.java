package com.example.helloworld.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String getHello() {
        logger.info("Info log message");
        return "Hello, World!";
    }
}
