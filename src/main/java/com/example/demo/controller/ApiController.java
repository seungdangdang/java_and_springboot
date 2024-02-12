package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// get method 를 통하여 요청을 내려주는 것을 작성
@RestController // 해당 클래스는 REST API를 처리하는 컨트롤러라는 의미
@RequestMapping("/api") // 주소 할당을 위해 URI를 지정해주는 어노테이션
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello 주소 매핑
    public String hello() {
        return "hello spring boot!";
    }
}
