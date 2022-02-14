package com.example.demo4.mapper;

import com.example.demo4.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student findById(Integer id);

    Integer insertStudent(Student student);

    Integer updateStudent(Student student);

    Integer deleteStudentById(Integer id);
}
