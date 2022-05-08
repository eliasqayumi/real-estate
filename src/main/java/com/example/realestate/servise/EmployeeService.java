package com.example.realestate.servise;

import com.example.realestate.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    void insert(Employee employee);
    void update(String employeeId,Employee employee);
    void deleteById(String employeeId);
    Employee getById(String employeeId);
}
