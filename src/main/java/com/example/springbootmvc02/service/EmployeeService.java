package com.example.springbootmvc02.service;

import com.example.springbootmvc02.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteById(long id);
}
