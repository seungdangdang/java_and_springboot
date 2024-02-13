package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-------------");

        ObjectMapper objectMapper = new ObjectMapper();

        // object -> text
        // 특징1. object mapper 는 get method 를 활용한다. -> 아무 메서드에 get을 붙이면 에러남
        JavaUser user = new JavaUser("seung", 20);
        String text = objectMapper.writeValueAsString(user);
        System.out.println(text);


        // text -> object
        // 특징2. objct mapper 는 default 생성자를 필요로 한다.
        JavaUser objectUser = objectMapper.readValue(text, JavaUser.class);
        System.out.println(objectUser);
    }
}
