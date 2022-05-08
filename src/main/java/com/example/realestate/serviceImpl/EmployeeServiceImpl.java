package com.example.realestate.serviceImpl;

import com.example.realestate.model.Employee;
import com.example.realestate.repository.EmployeeRepository;
import com.example.realestate.servise.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public void insert(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public void update(String employeeId, Employee employee) {
        Employee updateEmployee=this.employeeRepository.getById(employeeId);
        updateEmployee.setFirstname(employee.getFirstname());
        updateEmployee.setSurname(employee.getSurname());
        updateEmployee.setCity(employee.getCity());
        updateEmployee.setDistrict(employee.getDistrict());
        updateEmployee.setNeighbourhood(employee.getNeighbourhood());
        updateEmployee.setAddress(employee.getAddress());
        updateEmployee.setPosition(employee.getPosition());
        this.employeeRepository.save(updateEmployee);
    }

    @Override
    public void deleteById(String employeeId) {
        this.employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee getById(String employeeId) {
        return this.employeeRepository.getById(employeeId);
    }
}
