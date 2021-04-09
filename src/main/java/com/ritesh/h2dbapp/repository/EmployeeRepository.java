package com.ritesh.h2dbapp.repository;

import com.ritesh.h2dbapp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
