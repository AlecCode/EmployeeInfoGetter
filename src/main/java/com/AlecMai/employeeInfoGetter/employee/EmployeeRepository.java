package com.AlecMai.employeeInfoGetter.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.first_name = ?1")
    List<Employee> findByFirstName(String firstName);

    @Query("SELECT e FROM Employee e WHERE e.last_name = ?1")
    List<Employee> findByLastName(String lastName);

    @Query("SELECT e FROM Employee e WHERE e.address = ?1")
    List<Employee> findByAddress(String address);

    @Query("SELECT e FROM Employee e WHERE e.phone = ?1")
    List<Employee> findByPhone(Long phone);
}
