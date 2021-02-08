package com.AlecMai.employeeInfoGetter;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.AlecMai.employeeInfoGetter.employee.EmployeeController;
import com.AlecMai.employeeInfoGetter.employee.EmployeeService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EmployeeController.class)
public class ServiceTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService service;

    @Test
    public void getEmployeesTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employees")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeByIDTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employee/1")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeByFirstNameTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employee/first_name/Foo")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeByLastNameTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employee/last_name/Foo")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeByAddressTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employee/address/444 Street St")).andExpect(status().isOk());
    }

    @Test
    public void getEmployeeByPhoneTest() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/api/v1/employee/phone/7777777777")).andExpect(status().isOk());
    }
}
