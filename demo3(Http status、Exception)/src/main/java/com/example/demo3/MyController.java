package com.example.demo3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("test1");
        return "Hello Test1";
    }

    @RequestMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "Hello Test2";
    }


//    @RequestMapping("/test1")
//    public String test1(){
//        throw new RuntimeException("test1 Error");
//    }
//
//    @RequestMapping("/test2")
//    public String test2(){
//        throw new IllegalArgumentException("test2 Error");
//    }

//    @RequestMapping("/test")
//    public ResponseEntity<String> test(){
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Hello World");
//    }



}
