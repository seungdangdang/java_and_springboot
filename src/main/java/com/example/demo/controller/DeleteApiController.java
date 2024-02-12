package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);

        // 삭제하기 전에 값이 없어도 코드200을 던짐 = 멱등성
        // delete는 요청하는 값이 제한적이고 적기 때문에 따로 dto를 만들어서 받기보다는 pathVariable 형태 또는 queryParameter를 받는 것을 권장함
    }
}
