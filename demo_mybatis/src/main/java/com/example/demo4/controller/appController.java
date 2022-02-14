package com.example.demo4.controller;

import com.example.demo4.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class appController {

//    @GetMapping("/hello")
//    public String hello(Model model){
//        model.addAttribute("hello", "Hello World!!!"); // （變數名稱，變數值)
//        return "hello";
//    }

    @GetMapping("/form")
    public String form(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Person person, Model model){
        model.addAttribute("person", person);
        return "add";
        }

    }

