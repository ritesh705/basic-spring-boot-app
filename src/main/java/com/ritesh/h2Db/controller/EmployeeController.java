package com.ritesh.h2Db.controller;

import com.ritesh.h2Db.Properties;
import com.ritesh.h2Db.model.Employee;
import com.ritesh.h2Db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    Properties properties;

    @Autowired
    private EmployeeService employeeService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    private String getPort()
    {
        properties.printEnvProps();
        return port;
    }

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
