package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
