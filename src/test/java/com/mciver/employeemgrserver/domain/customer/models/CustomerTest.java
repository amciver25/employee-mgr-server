package com.mciver.employeemgrserver.domain.customer.models;

import com.mciver.employeemgrserver.domain.employee.models.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CustomerTest {
    @Test
    @DisplayName("Customer Lombok Constructor Test")
    public void constructorTest01(){
        //Given
        Date date = new Date();
        Customer customer = new Customer("Test", "Customer","test@customer.com");
        customer.setId(1L);
        //When
        String expected = "1 Test Customer test@customer.com";
        String actual = customer.toString();
        //Then
        Assertions.assertEquals(expected, actual);

    }
}
