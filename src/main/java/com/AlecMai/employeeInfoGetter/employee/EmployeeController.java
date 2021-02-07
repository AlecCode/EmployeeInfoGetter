package com.AlecMai.employeeInfoGetter.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("api/v1/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("api/v1/employee/{id}")
    public Employee getEmployeeID(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("api/v1/employee_first_name/{firstName}")
    public Employee getEmployeeFirstName(@PathVariable String firstName) {
        return employeeService.getEmployeeByFirstName(firstName);
    }

    @GetMapping("api/v1/employee_last_name/{lastName}")
    public Employee getEmployeeLastName(@PathVariable String lastName) {
        return employeeService.getEmployeeByLastName(lastName);
    }
}
