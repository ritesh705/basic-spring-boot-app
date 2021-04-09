package com.ritesh.h2Db.controller;

import com.ritesh.h2Db.model.Employee;
import com.ritesh.h2Db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    private int saveOrUpdateEmployee(@RequestBody Employee employee){
        int response = -1;
        employeeService.saveOrUpdate(employee);
        return employee.getId();
    }

    @GetMapping("/employee/{id}")
    private Employee getEmployeeById(@PathVariable("id") int id){
        Employee response = null;
        response = employeeService.getEmployeeById(id);
        return response;
    }

    @GetMapping("/employee")
    private List<Employee> getAllEmployee(){
        List<Employee> response = null;
        response = employeeService.getAllEmployees();
        return response;
    }

    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("id") int id){
        employeeService.delete(id);
    }
}
