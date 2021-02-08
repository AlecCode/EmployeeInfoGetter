package com.AlecMai.employeeInfoGetter.employee;

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

    public List<Employee> getEmployeeByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    public List<Employee> getEmployeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }

    public List<Employee> getEmployeeByAddress(String address) {
        return employeeRepository.findByAddress(address);
    }

    public List<Employee> getEmployeeByPhone(Long phone) {
        return employeeRepository.findByPhone(phone);
    }
}
