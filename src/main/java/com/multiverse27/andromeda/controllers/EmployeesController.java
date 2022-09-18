package com.multiverse27.andromeda.controllers;

import com.multiverse27.andromeda.entities.Employee;
import com.multiverse27.andromeda.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("Enrique");
        employee.setEmail("bvergara@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Multiverse27");
        employee.setProfile("kiikechavez");
        employee.setPassword("123456");
        return employee;
    }

    @RequestMapping(value = "/employees23423")
    public Employee modifyEmployees() {
        Employee employee = new Employee();
        employee.setName("Enrique");
        employee.setEmail("bvergara@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Multiverse27");
        employee.setProfile("kiikechavez");
        employee.setPassword("123456");
        return employee;
    }

    @RequestMapping(value = "/employees2342")
    public Employee deleteEmployees() {
        Employee employee = new Employee();
        employee.setName("Enrique");
        employee.setEmail("bvergara@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Multiverse27");
        employee.setProfile("kiikechavez");
        employee.setPassword("123456");
        return employee;
    }

    @RequestMapping(value = "/employees2342476")
    public Employee searchEmployees() {
        Employee employee = new Employee();
        employee.setName("Enrique");
        employee.setEmail("bvergara@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Multiverse27");
        employee.setProfile("kiikechavez");
        employee.setPassword("123456");
        return employee;
    }
}
