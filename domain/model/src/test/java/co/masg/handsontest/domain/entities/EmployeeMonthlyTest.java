package co.masg.handsontest.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMonthlyTest {

    @Test
    void testCalculateSalary() {
        var employee = new EmployeeMonthly();

        employee.setId(1);
        employee.setName("name");
        employee.setContractTypeName("contract type");
        employee.setRoleId(1);
        employee.setRoleName("role name");
        employee.setRoleDescription("role description");
        employee.setHourlySalary(2.0);
        employee.setMonthlySalary(3.0);

        var result = employee.getMonthlySalary() * 12;

        Assertions.assertEquals(employee.calculateSalary(), result);
    }
}