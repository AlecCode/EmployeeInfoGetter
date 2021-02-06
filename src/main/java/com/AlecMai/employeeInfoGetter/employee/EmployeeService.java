package com.AlecMai.employeeInfoGetter.employee;

import java.util.List;

public class EmployeeService {

    public List<Employee> getStudents() {
        return List.of(
                new Employee(1L, "Foo", "Bar", "123 Street St", 1234567890),
                new Employee(2L, "Bar", "Foo", "124 Street St", 1234567891)
        );
    }
}
