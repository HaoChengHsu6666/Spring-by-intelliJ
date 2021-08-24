package com.example.demo4.service;

import com.example.demo4.Student;
import com.example.demo4.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }
}
