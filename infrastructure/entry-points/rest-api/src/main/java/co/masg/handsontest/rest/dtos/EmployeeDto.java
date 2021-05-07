package co.masg.handsontest.rest.dtos;

import co.masg.handsontest.domain.entities.Employee;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class EmployeeDto {

    private Integer id;
    private String name;
    private String contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Double hourlySalary;
    private Double monthlySalary;
    private Double annualSalary;

    public static EmployeeDto convertToEmployeeDto(Employee employee){
        return EmployeeDto.builder()
                .id(employee.getId())
                .name(employee.getName())
                .contractTypeName(employee.getContractTypeName())
                .roleId(employee.getRoleId())
                .roleName(employee.getRoleName())
                .roleDescription(employee.getRoleDescription())
                .hourlySalary(employee.getHourlySalary())
                .monthlySalary(employee.getMonthlySalary())
                .annualSalary(employee.getAnnualSalary())
                .build();
    }
}
