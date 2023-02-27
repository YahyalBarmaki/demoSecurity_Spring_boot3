package com.yaya.demosecurity.other;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class OtherController {

    @GetMapping
    public ResponseEntity<String> testSecure(){
        return ResponseEntity.ok("Hello secure endpoint");
    }
}
