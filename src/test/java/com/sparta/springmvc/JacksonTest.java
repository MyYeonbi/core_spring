package com.sparta.springmvc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object TO JSON : get Method 필요")
        void test1() throws JsonProcessingException {
            Star star = new Star("Robbie", 95);

            ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper
            String json = objectMapper.writeValueAsString(star);

            System.out.println("json = " + json);
        }
    }

