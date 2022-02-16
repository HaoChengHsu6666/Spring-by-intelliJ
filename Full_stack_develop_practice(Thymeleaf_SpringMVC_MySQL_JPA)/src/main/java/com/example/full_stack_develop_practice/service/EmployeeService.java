package com.example.full_stack_develop_practice.service;

import com.example.full_stack_develop_practice.model.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
