package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/response")
public class ResponseController {

    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}

        @GetMapping("/json/string")
        @ResponseBody
        public String helloStringJson() {
            return "{\"name\":\"Robbie\",\"age\":95}";
        }

        
    }


