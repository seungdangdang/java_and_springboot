package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// get method 를 통하여 요청을 내려주는 것을 작성
@RestController // 해당 클래스는 REST API를 처리하는 컨트롤러라는 의미
@RequestMapping("/api") // 주소 할당을 위해 URI를 지정해주는 어노테이션
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello 주소 매핑
    public String hello() {
        return "hello spring boot!";
    }

    // 응답값으로 text 받기
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // 응답값으로 JSON Object 받기
    // request 받음 -> object mapper을 통해 object 로 변경 -> method 진행하여 return값 object 를 받음 -> object mapper를 통해 json 로 변경 -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

    // 응답값으로 ResponseEntity 받기
    // HTTP 응답값 변경하기
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
