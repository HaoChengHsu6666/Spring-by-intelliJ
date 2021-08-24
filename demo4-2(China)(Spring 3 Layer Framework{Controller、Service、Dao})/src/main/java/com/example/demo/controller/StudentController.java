package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
//@RequestMapping("api/student")
public class StudentController {

    private StudentService studentService;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello spring boot !!!";
    }

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added student !!!";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Updated student !!!";
    }

    @DeleteMapping(path = "{id}")
    //localhost:8080/api/student/
    public String deleteStudent(@PathVariable("id") UUID id){
        studentService.deleteStudent(id);
        return "Deleted student !!!";
    }
}
