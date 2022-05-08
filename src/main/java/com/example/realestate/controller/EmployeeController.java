package com.example.realestate.controller;

import com.example.realestate.model.Employee;
import com.example.realestate.serviceImpl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAll() {
        return this.employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") String employeeId) {
        return this.employeeService.getById(employeeId);
    }

    @PostMapping
    public void insert(@RequestBody Employee employee) {
        this.employeeService.insert(employee);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String employeeId, @RequestBody Employee employee) {
        this.employeeService.update(employeeId, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String employeeId) {
        this.employeeService.deleteById(employeeId);
    }
}
