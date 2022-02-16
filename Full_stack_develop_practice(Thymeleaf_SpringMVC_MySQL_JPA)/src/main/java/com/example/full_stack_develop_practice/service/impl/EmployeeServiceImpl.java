package com.example.full_stack_develop_practice.service.impl;

import com.example.full_stack_develop_practice.model.Employee;
import com.example.full_stack_develop_practice.repository.EmployeeRepository;
import com.example.full_stack_develop_practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    public Employee getEmployeeById(long id){
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()){
            employee = optional.get();
        }else {
            throw new RuntimeException("Employee not found for id !" + id);
        }
        return  employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
}
