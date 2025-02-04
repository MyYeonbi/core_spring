package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/response")
public class ResponseController {

    //   Content-Type: text/html



        @GetMapping("/json/string")
        @ResponseBody
        public String helloStringJson() {
            return "{\"name\":\"Robbie\",\"age\":95}";
        }

        // Content-Type : applicateion/json
       // Response Body
        //   {"name":"Robbie","age":95}
        @GetMapping("/json/class")
        @ResponseBody
    public Star helloClassJson() {
            return new Star("Robbie", 95);
    }


    }


