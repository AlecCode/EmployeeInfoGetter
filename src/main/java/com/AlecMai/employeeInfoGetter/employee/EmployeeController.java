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

    @GetMapping("api/v1/employee/first_name/{firstName}")
    public List<Employee> getEmployeeFirstName(@PathVariable String firstName) {
        return employeeService.getEmployeeByFirstName(firstName);
    }

    @GetMapping("api/v1/employee/last_name/{lastName}")
    public List<Employee> getEmployeeLastName(@PathVariable String lastName) {
        return employeeService.getEmployeeByLastName(lastName);
    }

    @GetMapping("api/v1/employee/address/{address}")
    public List<Employee> getEmployeeAddress(@PathVariable String address) {
        return employeeService.getEmployeeByAddress(address);
    }

    @GetMapping("api/v1/employee/phone/{phone}")
    public List<Employee> getEmployeePhone(@PathVariable Long phone) {
        return employeeService.getEmployeeByPhone(phone);
    }

    //Add new employee
    @PostMapping(path = "api/v1/add_employee", consumes = "application/json", produces = "application/json")
    public void registerNewEmployee(@RequestBody Employee employee) {
        employeeService.addNewEmployee(employee);
    }
}
