package co.masg.handsontest.usecase;

import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.entities.EmployeeHourly;
import co.masg.handsontest.domain.gateways.EmployeeGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GetEmployeeUseCaseTest {

    @Mock
    private EmployeeGateway employeeGateway;

    @InjectMocks
    private GetEmployeeUseCase getEmployeeUseCase;

    @Test
    void testGetAllEmployeesWhenMonthlyEmployee() {

        var employee = createMonthlyEmployee();

        var employeeWithAnnualSalary = employee;
        employeeWithAnnualSalary.setAnnualSalary(employeeWithAnnualSalary.getAnnualSalary());

        Mockito.when(employeeGateway.getAllEmployees()).thenReturn(Collections.singletonList(employee));

        var employeeResult = getEmployeeUseCase.getAllEmployees();

        Assertions.assertEquals(employeeResult.get(0).getId(), employeeWithAnnualSalary.getId());
        Assertions.assertEquals(employeeResult.get(0).getName(), employeeWithAnnualSalary.getName());
        Assertions.assertEquals(employeeResult.get(0).getRoleId(), employeeWithAnnualSalary.getRoleId());
        Assertions.assertEquals(employeeResult.get(0).getRoleName(), employeeWithAnnualSalary.getRoleName());
        Assertions.assertEquals(employeeResult.get(0).getRoleDescription(), employeeWithAnnualSalary.getRoleDescription());
        Assertions.assertEquals(employeeResult.get(0).getContractTypeName(), employeeWithAnnualSalary.getContractTypeName());
        Assertions.assertEquals(employeeResult.get(0).getHourlySalary(), employeeWithAnnualSalary.getHourlySalary());
        Assertions.assertEquals(employeeResult.get(0).getMonthlySalary(), employeeWithAnnualSalary.getMonthlySalary());
        Assertions.assertEquals(employeeResult.get(0).getAnnualSalary(), employeeWithAnnualSalary.getAnnualSalary());

        Mockito.verify(employeeGateway, Mockito.times(1))
                .getAllEmployees();

    }

    @Test
    void testGetAllEmployeesWhenHourlyEmployee() {

        var employee = createHourlyEmployee();

        var employeeWithAnnualSalary = employee;
        employeeWithAnnualSalary.setAnnualSalary(employeeWithAnnualSalary.getAnnualSalary());

        Mockito.when(employeeGateway.getAllEmployees()).thenReturn(Collections.singletonList(employee));

        var employeeResult = getEmployeeUseCase.getAllEmployees();

        Assertions.assertEquals(employeeResult.get(0).getId(), employeeWithAnnualSalary.getId());
        Assertions.assertEquals(employeeResult.get(0).getName(), employeeWithAnnualSalary.getName());
        Assertions.assertEquals(employeeResult.get(0).getRoleId(), employeeWithAnnualSalary.getRoleId());
        Assertions.assertEquals(employeeResult.get(0).getRoleName(), employeeWithAnnualSalary.getRoleName());
        Assertions.assertEquals(employeeResult.get(0).getRoleDescription(), employeeWithAnnualSalary.getRoleDescription());
        Assertions.assertEquals(employeeResult.get(0).getContractTypeName(), employeeWithAnnualSalary.getContractTypeName());
        Assertions.assertEquals(employeeResult.get(0).getHourlySalary(), employeeWithAnnualSalary.getHourlySalary());
        Assertions.assertEquals(employeeResult.get(0).getMonthlySalary(), employeeWithAnnualSalary.getMonthlySalary());
        Assertions.assertEquals(employeeResult.get(0).getAnnualSalary(), employeeWithAnnualSalary.getAnnualSalary());

        Mockito.verify(employeeGateway, Mockito.times(1))
                .getAllEmployees();
    }

    @Test
    void testGetAllEmployeesThenReturnEmptyList() {
        Mockito.when(employeeGateway.getAllEmployees()).thenReturn(Collections.emptyList());

        var employeeResult = getEmployeeUseCase.getAllEmployees();

        Assertions.assertTrue(employeeResult.isEmpty());

        Mockito.verify(employeeGateway, Mockito.times(1))
                .getAllEmployees();
    }

    @Test
    void getEmployeeByIdWhenHourlyEmployee() {
        var employee = createHourlyEmployee();

        var employeeWithAnnualSalary = employee;
        employeeWithAnnualSalary.setAnnualSalary(employeeWithAnnualSalary.getAnnualSalary());

        Mockito.when(employeeGateway.getEmployeeById(ArgumentMatchers.eq(1))).thenReturn(employee);

        var employeeResult = getEmployeeUseCase.getEmployeeById(1);

        Assertions.assertEquals(employeeResult.getId(), employeeWithAnnualSalary.getId());
        Assertions.assertEquals(employeeResult.getName(), employeeWithAnnualSalary.getName());
        Assertions.assertEquals(employeeResult.getRoleId(), employeeWithAnnualSalary.getRoleId());
        Assertions.assertEquals(employeeResult.getRoleName(), employeeWithAnnualSalary.getRoleName());
        Assertions.assertEquals(employeeResult.getRoleDescription(), employeeWithAnnualSalary.getRoleDescription());
        Assertions.assertEquals(employeeResult.getContractTypeName(), employeeWithAnnualSalary.getContractTypeName());
        Assertions.assertEquals(employeeResult.getHourlySalary(), employeeWithAnnualSalary.getHourlySalary());
        Assertions.assertEquals(employeeResult.getMonthlySalary(), employeeWithAnnualSalary.getMonthlySalary());
        Assertions.assertEquals(employeeResult.getAnnualSalary(), employeeWithAnnualSalary.getAnnualSalary());

        Mockito.verify(employeeGateway, Mockito.times(1))
                .getEmployeeById(ArgumentMatchers.eq(1));
    }

    @Test
    void getEmployeeByIdWhenMonthlyEmployee() {
        var employee = createMonthlyEmployee();

        var employeeWithAnnualSalary = employee;
        employeeWithAnnualSalary.setAnnualSalary(employeeWithAnnualSalary.getAnnualSalary());

        Mockito.when(employeeGateway.getEmployeeById(ArgumentMatchers.eq(1))).thenReturn(employee);

        var employeeResult = getEmployeeUseCase.getEmployeeById(1);

        Assertions.assertEquals(employeeResult.getId(), employeeWithAnnualSalary.getId());
        Assertions.assertEquals(employeeResult.getName(), employeeWithAnnualSalary.getName());
        Assertions.assertEquals(employeeResult.getRoleId(), employeeWithAnnualSalary.getRoleId());
        Assertions.assertEquals(employeeResult.getRoleName(), employeeWithAnnualSalary.getRoleName());
        Assertions.assertEquals(employeeResult.getRoleDescription(), employeeWithAnnualSalary.getRoleDescription());
        Assertions.assertEquals(employeeResult.getContractTypeName(), employeeWithAnnualSalary.getContractTypeName());
        Assertions.assertEquals(employeeResult.getHourlySalary(), employeeWithAnnualSalary.getHourlySalary());
        Assertions.assertEquals(employeeResult.getMonthlySalary(), employeeWithAnnualSalary.getMonthlySalary());
        Assertions.assertEquals(employeeResult.getAnnualSalary(), employeeWithAnnualSalary.getAnnualSalary());

        Mockito.verify(employeeGateway, Mockito.times(1))
                .getEmployeeById(ArgumentMatchers.eq(1));
    }

    private Employee createHourlyEmployee(){
        var employee = new EmployeeHourly();

        employee.setId(1);
        employee.setName("name");
        employee.setContractTypeName("contract type");
        employee.setRoleId(1);
        employee.setRoleName("role name");
        employee.setRoleDescription("role description");
        employee.setHourlySalary(2.0);
        employee.setMonthlySalary(3.0);

        return employee;
    }

    private Employee createMonthlyEmployee(){
        var employee = new EmployeeHourly();

        employee.setId(1);
        employee.setName("name");
        employee.setContractTypeName("contract type");
        employee.setRoleId(1);
        employee.setRoleName("role name");
        employee.setRoleDescription("role description");
        employee.setHourlySalary(2.0);
        employee.setMonthlySalary(3.0);

        return employee;
    }
}