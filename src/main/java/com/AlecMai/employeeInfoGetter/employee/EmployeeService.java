package com.AlecMai.employeeInfoGetter.employee;

import com.AlecMai.employeeInfoGetter.EmployeeInfoGetterApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    public Employee getEmployeeByFirstName(String firstName) {
        for (Employee e : employeeRepository.findAll()) {
            if (e.getFirst_name().equalsIgnoreCase(firstName)) {
                return e;
            }
        }

        throw new EmployeeNotFoundException(firstName);
    }

    public Employee getEmployeeByLastName(String lastName) {
        for (Employee e : employeeRepository.findAll()) {
            if (e.getLast_name().equalsIgnoreCase(lastName)) {
                return e;
            }
        }

        throw new EmployeeNotFoundException(lastName);
    }
}
