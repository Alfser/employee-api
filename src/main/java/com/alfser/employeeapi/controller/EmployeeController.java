package com.alfser.employeeapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfser.employeeapi.model.Employee;
import com.alfser.employeeapi.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(value = "/")
    public List<Employee> get(){
        return employeeService.findAll();
    }

    @PostMapping(value = "/")
    public Employee save(@RequestBody(required = true) Employee body){
        return employeeService.save(body);
    }
}
