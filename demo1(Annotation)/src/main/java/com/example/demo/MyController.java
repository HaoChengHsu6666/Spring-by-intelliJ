package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id,
                        @RequestParam(defaultValue = "Chris") String name){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        return "Hello test 1";
    }

    @RequestMapping("/test2")
    public String test2(@RequestBody Student student){
        System.out.println("student id: " + student.id);
        System.out.println("student name: " + student.name);
        return "Hello test 2!";
    }

    @RequestMapping("/test3")
    public String test3(@RequestHeader String info){
        System.out.println("header info " + info);
        return "Hello test 3@@@";
    }

    @RequestMapping("/test4/{id}/{name}")
    public String test4(@PathVariable Integer id,
                        @PathVariable String name){ //@PathVariable的id需與@RequestMapping的id一致!!!
        System.out.println("path id: " + id);
        System.out.println("path name: "+ name);
        return "Hello test 4***";
    }
//    @RequestMapping("/product")
//    public Store product(){
//        Store store = new Store();
//        List<String> list = new ArrayList<>();
//        list.add("Apple!");
//        list.add("Orange!");
//        store.setProductList(list);
//        return store;
//    }
//
//    @RequestMapping("/user")
//    public Student user(){
//        Student student = new Student();
//        student.setName("Chris");
//        return student;
//    }


}
