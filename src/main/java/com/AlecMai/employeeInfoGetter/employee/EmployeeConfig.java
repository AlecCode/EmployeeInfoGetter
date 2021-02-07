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
                    "123 Street St",
                    1234567890);

            Employee bar = new Employee(
                    "Bar",
                    "Foo",
                    "124 Street St",
                    1234567891);

            repository.saveAll(List.of(foo, bar));
        };
    }
}