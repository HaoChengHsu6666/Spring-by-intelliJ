package com.example.demo4.controller;

import com.example.demo4.entity.Student;
import com.example.demo4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student findById(@PathVariable Integer id){
        return studentService.findById(id);
    }

    @PostMapping("")
    public Integer insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }

    @PutMapping("")
    public Integer updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public Integer deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }
}
