package com.example.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students/{studentId}")
    public Student read(@PathVariable Integer studentId){

        Student student = studentRepository.findById(studentId).orElse(null);

        return student;
    }

    @PostMapping("/students")
    public String insert(@RequestBody Student student){
        studentRepository.save(student);
        return "執行資料庫的Create操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){

        Student s = studentRepository.findById(studentId).orElse(null);

        if(s != null){
            s.setName(student.getName());
            studentRepository.save(s);

            return "執行資料庫的Update操作";
        }else {
            return "Update 失敗!!!，數據不存在";
        }
//        student.setId(studentId);
//        studentRepository.save(student);
//        return "執行資料庫的Update操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){

        studentRepository.deleteById(studentId);

        return "執行資料庫的delete操作";
    }
}
