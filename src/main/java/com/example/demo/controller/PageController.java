package com.example.demo.controller;

import com.example.demo.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() { // A. return값이 String이 되면 resource에 있는 html을 찾아감
        return "main.html";
    }

    // B. ResponseEntity 받기 - 생략

    @ResponseBody // C. resource를 찾지 않고 아래 responseBody 자체로 내리겠다는 뜻
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setName("seung");
        user.setAddress("서울");
        return user;
    }
}
