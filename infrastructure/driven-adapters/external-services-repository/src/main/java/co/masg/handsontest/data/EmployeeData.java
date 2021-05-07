package co.masg.handsontest.data;

import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.entities.EmployeeFactory;
import co.masg.handsontest.domain.entities.EmployeeMonthly;
import lombok.Data;

@Data
public class EmployeeData {
    private Integer id;
    private String name;
    private String contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Double hourlySalary;
    private Double monthlySalary;

    public static Employee convertToEmployee(EmployeeData employeeData){

        var employee = EmployeeFactory.createEmployee(employeeData.getContractTypeName());

        employee.setId(employeeData.getId());
        employee.setName(employeeData.getName());
        employee.setContractTypeName(employeeData.getContractTypeName());
        employee.setRoleId(employeeData.getRoleId());
        employee.setRoleName(employeeData.getRoleName());
        employee.setRoleDescription(employeeData.getRoleDescription());
        employee.setHourlySalary(employeeData.getHourlySalary());
        employee.setMonthlySalary(employeeData.getMonthlySalary());

        return employee;
    }
}
