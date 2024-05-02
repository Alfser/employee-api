package com.alfser.employeeapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alfser.employeeapi.model.Employee;
import com.alfser.employeeapi.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
}
