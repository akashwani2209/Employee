package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        employee.setLanID(id);
        return service.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }

}
