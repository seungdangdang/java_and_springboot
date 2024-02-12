package com.example.demo.controller;

// 실제 프로젝트에서 Get클래스를 따로 작성하지는 않음!

import com.example.demo.dto.UserRequest;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    //MEMO: get 활용
    @GetMapping("/hello")
    public String getHello() {
        return "get Hello";
    }

//    @GetMapping(path = "/hello") // path = 을 통해 명시적 표현 가능
//    public String getHello() {
//        return "get Hello";
//    }

//    아래는 예전에 사용하던 방식, GetMapping을 통해 보완됨
//    @RequestMapping(path = "/hi", method = RequestMethod.GET) // RequestMapping 을 쓰면 get, post, put, delete 모든 메서드가 매핑되기 때문에 method를 명시 해줌
//    public String hi() {
//        return "hi";
//    }

    //MEMO: PathVariable 받기

    // ex - http://localhost:9090/api/get/pathvariable/{name}
    @GetMapping("/path-variable/{name}") // 괄호안에 넣은 이름과 메서드 매개변수로 넣은 이름이 같아야 함
    public String pathVariable(@PathVariable String name) {
        System.out.println("pathVariable : " + name);
        return name;
    }

//    @GetMapping("/path-variable/{name}")
//    public String pathVariable(@PathVariable(name = "name") String pathName) { // 만약 매개변수의 이름을 달리 해야한다면 (name = "괄호 안 변수") 를 넣어줌
//        System.out.println("pathVariable : " + pathName);
//        return pathName;
//    }

    // MEMO: QueryParameter 받기
    // ex - http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=23
    // 문제점 - Key가 어떤건지 알 수 없음
    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // 문제점 - RequestParam이 많아지면 계속 작성하기에 어려움
    @GetMapping("query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ){
        System.out.println("이름은 " + name + ", 이메일은 " + email + ", 나이는 " + age);
        return name + email + age;
    }

    // best
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) { //RequestParam 어노테이션 안붙임
        System.out.println("이름은 " + userRequest.getName() + ", 이메일은 " + userRequest.getEmail() + ", 나이는 " + userRequest.getAge());
        return userRequest.toString();
    }
}
