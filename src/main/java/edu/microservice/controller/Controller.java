package edu.microservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/test")
public class Controller {

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getAllUsers() {
        return "Users:\n" + "1. Denis\n" + "2. Ann";
    }

    @GetMapping(path = "/date", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE) + "\n" + "Users:\n" + "1. Denis\n" + "2. Ann";
    }

}
