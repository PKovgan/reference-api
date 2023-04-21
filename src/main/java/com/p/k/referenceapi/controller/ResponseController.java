package com.p.k.referenceapi.controller;

import com.p.k.referenceapi.entity.Mapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @GetMapping(value = "/")
    public ResponseEntity<Mapping> getResponse() {
        Mapping mapping = new Mapping();
        mapping.setAc("111111");
        mapping.setABCCopy("ABC");
        mapping.setEntity("A");
        return ResponseEntity.ok(mapping);
    }
}
