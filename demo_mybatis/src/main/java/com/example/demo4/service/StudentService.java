package com.example.demo4.service;

import com.example.demo4.entity.Student;

import java.util.List;

public interface StudentService {

      Student findById(Integer id);

      Integer insertStudent(Student student);

      Integer updateStudent(Student student);

      Integer deleteStudentById(Integer id);
}
