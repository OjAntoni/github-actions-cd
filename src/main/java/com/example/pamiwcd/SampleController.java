package com.example.pamiwcd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String getSomeText(){
        return "Hello World from Spring Boot!";
    }
}
