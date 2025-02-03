package com.sparta.springprepare.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    @ResoponseBody
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }
}
