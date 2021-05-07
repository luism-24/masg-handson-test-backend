package co.masg.handsontest.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeHourlyTest {

    @Test
    void testCalculateSalary() {

        var employee = new EmployeeHourly();

        employee.setId(1);
        employee.setName("name");
        employee.setContractTypeName("contract type");
        employee.setRoleId(1);
        employee.setRoleName("role name");
        employee.setRoleDescription("role description");
        employee.setHourlySalary(2.0);
        employee.setMonthlySalary(3.0);

        var result = 120 * employee.getHourlySalary() * 12;

        Assertions.assertEquals(employee.calculateSalary(), result);
    }



}