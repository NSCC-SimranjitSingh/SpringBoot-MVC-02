package com.example.springbootmvc02.service;

import com.example.springbootmvc02.entity.Employee;
import com.example.springbootmvc02.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return empRepo.findAll();
    }

    @Override
    public void save(Employee employee) {
        empRepo.save(employee);
    }

    @Override
    public Employee getById(Long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        empRepo.deleteById(id);
    }
}
