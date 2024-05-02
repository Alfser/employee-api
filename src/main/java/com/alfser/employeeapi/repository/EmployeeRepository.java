package com.alfser.employeeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfser.employeeapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
    
}
