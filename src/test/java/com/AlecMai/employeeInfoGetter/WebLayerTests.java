package com.AlecMai.employeeInfoGetter;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class WebLayerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test //Sanity check
    public void contextLoads() {}

    @Test
    public void employeesTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("111 Street St");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("222 Street St");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("333 Street St");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("444 Street St");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("555 Street St");
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employees",
                String.class)).contains("777 Street St");
    }

    @Test
    public void employeeGetByIdTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employee/5",
                String.class)).contains("444 Street St");
    }

    @Test
    public void employeeGetByFirstNameTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employee/first_name/Foo",
                String.class)).contains("111 Street St");
    }

    @Test
    public void employeeGetByLastNameTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employee/last_name/Foo",
                String.class)).contains("222 Street St");
    }

    @Test
    public void employeeGetByAddress() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employee/address/777 Street St",
                String.class)).contains("777 Street St");
    }

    @Test
    public void employeeGetByPhone() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/employee/phone/4444444444",
                String.class)).contains("444 Street St");
    }
}