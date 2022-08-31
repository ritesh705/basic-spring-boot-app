package com.ritesh.app.service;

import com.ritesh.app.model.Employee;
import com.ritesh.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveOrUpdate(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id) {
        Employee employee = null;
        employee = employeeRepository.findById(id).get();
        return employee;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(e -> employees.add(e));
        return employees;
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
