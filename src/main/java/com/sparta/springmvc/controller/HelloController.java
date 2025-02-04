package com.sparta.springmvc.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}
