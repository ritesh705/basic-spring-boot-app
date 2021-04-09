package com.ritesh.h2Db.repository;

import com.ritesh.h2Db.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
