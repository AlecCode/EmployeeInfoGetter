package com.AlecMai.employeeInfoGetter.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee foo = new Employee(
                    "Foo",
                    "Bar",
                    "111 Street St",
                    1111111111L);

            Employee foof = new Employee(
                    "Foo",
                    "B4r",
                    "111 Street St",
                    1110001100L);

            Employee bar = new Employee(
                    "Bar",
                    "Foo",
                    "222 Street St",
                    2222222222L);

            Employee pete = new Employee(
                    "Pete",
                    "Pette",
                    "333 Street St",
                    3333333333L);

            Employee derrick = new Employee(
                    "Derrick",
                    "Derrickson",
                    "444 Street St",
                    4444444444L);

            Employee tim = new Employee(
                    "Tim",
                    "Timmothy",
                    "555 Street St",
                    5555555555L);

            Employee jim = new Employee(
                    "Jim",
                    "Jimmothy",
                    "777 Street St",
                    7777777777L);

            repository.saveAll(List.of(foo, foof, bar, pete, derrick, tim, jim));
        };
    }
}