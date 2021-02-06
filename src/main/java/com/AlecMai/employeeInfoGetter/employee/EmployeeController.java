package com.AlecMai.employeeInfoGetter.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employee")
public class EmployeeController {

    @GetMapping
    public List<Employee> getStudents() {
        return List.of(
                new Employee(1L, "Foo", "Bar", "123 Street St", 1234567890),
                new Employee(2L, "Bar", "Foo", "124 Street St", 1234567891)
        );
    }
}
