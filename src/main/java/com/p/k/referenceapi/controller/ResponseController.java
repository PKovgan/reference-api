package com.p.k.referenceapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @GetMapping(value = "/")
    public String getMainPage() {
        return "Hello";
    }
}
