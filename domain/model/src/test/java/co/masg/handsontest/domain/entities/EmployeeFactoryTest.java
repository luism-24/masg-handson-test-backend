package co.masg.handsontest.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void testCreateEmployeeWhenContractTypeIsHourlySalaryEmployee() {

        var employeeHourly = EmployeeFactory.createEmployee("HourlySalaryEmployee");

        Assertions.assertEquals(employeeHourly.getClass(), EmployeeHourly.class);

    }

    @Test
    void testCreateEmployeeWhenContractTypeIsMonthlySalaryEmployee() {

        var monthlySalaryEmployee = EmployeeFactory.createEmployee("MonthlySalaryEmployee");

        Assertions.assertEquals(monthlySalaryEmployee.getClass(), EmployeeMonthly.class);

    }
}