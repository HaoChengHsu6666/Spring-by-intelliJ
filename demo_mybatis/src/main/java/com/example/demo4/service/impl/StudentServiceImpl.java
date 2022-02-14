package com.example.demo4.service.impl;

import com.example.demo4.entity.Student;
import com.example.demo4.mapper.StudentMapper;
import com.example.demo4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

     public Student findById(Integer id){
         return studentMapper.findById(id);
     }

     public Integer insertStudent(Student student){
         return studentMapper.insertStudent(student);
     }

     public Integer updateStudent(Student student){
         return studentMapper.updateStudent(student);
     }

     public Integer deleteStudentById(Integer id){
         return studentMapper.deleteStudentById(id);
     }

}
