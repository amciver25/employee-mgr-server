package com.mciver.employeemgrserver.domain.employee.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    @Test
    @DisplayName("Employee Lombok Constructor Test")
    public void constructorTest01(){
        //Given
        Employee employee = new Employee("Test", "User","test@user.com");
        employee.setId(1L);
        //When
        String expected = "1 Test User test@user.com";
        String actual = employee.toString();
        //Then
        Assertions.assertEquals(expected, actual);

    }
}
