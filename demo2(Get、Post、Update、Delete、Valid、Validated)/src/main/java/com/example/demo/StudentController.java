package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@Validated
public class StudentController {


    @PostMapping("/students")
    //@PutMapping
    //@DeleteMapping
    //@RequestMapping(value = "/students", method = RequestMethod.POST)
    public String create(@RequestBody @Valid Student student){
//        if(student.getId() == null){
//            throw new RuntimeException("id 不得為 null!!!");
//        }
        return "執行資料庫的Create操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable @Min(100) Integer studentId){
        return "執行資料庫的Read操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student,
                         @RequestHeader String info){
        return "執行資料庫的Update操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){
        return "執行資料庫的delete操作";
    }
}
