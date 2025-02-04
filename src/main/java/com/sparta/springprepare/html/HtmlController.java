package com.sparta.springprepare.html;

import org.springframework.stereotype.Controller;

@Controller
public class HtmlController {

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }
}
