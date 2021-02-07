package com.AlecMai.employeeInfoGetter.employee;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }

    EmployeeNotFoundException(String name) {
        super("Could not find employee " + name);
    }
}
