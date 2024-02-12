package com.example.demo.controller;

import com.example.demo.dto.PostRequestDto;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    // 문제점 - 어떤 값을 보낼지 모름
//    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData) {
//        requestData.forEach((key, value) -> {
//            System.out.println("key" + key);
//            System.out.println("value" + value);
//        });
//    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
    }
}
