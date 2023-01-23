package com.ssil.java.designpatterns.creation.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTests {

    @Test
    public void testEmployeeClone() {
        Employee employee = new Employee(1, "aa");
        assertEquals(employee.getId(), 1);
        assertEquals(employee.getName(), "aa");
        employee.setName("bb");
        assertEquals(employee.getName(), "bb");
        Employee cloned = (Employee) employee.clone();
        assertEquals(cloned.getId(), 1);
        assertEquals(cloned.getName(), "bb");
    }

}
