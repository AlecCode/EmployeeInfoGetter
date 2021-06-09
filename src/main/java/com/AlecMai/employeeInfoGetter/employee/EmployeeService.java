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

    public void addNewEmployee(Employee employee) {
        List<Employee> byFirstName  = employeeRepository.findByFirstName(employee.getFirst_name());
        List<Employee> byLastName   = employeeRepository.findByLastName(employee.getLast_name());
        List<Employee> byAddress    = employeeRepository.findByAddress(employee.getAddress());
        List<Employee> byPhone      = employeeRepository.findByPhone(employee.getPhone());

        if (byFirstName.size() != 0 || byLastName.size() != 0 || byAddress.size() != 0 || byPhone.size() != 0) {
            throw new IllegalStateException("Some information entered already exists under another employee.");
        }

        employeeRepository.save(employee);
        //System.out.println(employee.toString());
    }

    public void removeEmployee(Long id) {
        boolean exists = employeeRepository.existsById(id);

        if (!exists) {
            throw new IllegalStateException("Employee with ID: " + id + " does not exist.");
        } else {
            employeeRepository.deleteById(id);
        }
    }
}
