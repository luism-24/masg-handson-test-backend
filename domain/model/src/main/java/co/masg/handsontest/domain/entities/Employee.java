package co.masg.handsontest.domain.entities;

import lombok.Data;

@Data
public abstract class Employee {

    private Integer id;
    private String name;
    private String contractTypeName;
    private Integer roleId;
    private String roleName;
    private String roleDescription;
    private Double hourlySalary;
    private Double monthlySalary;
    private Double annualSalary;

    public abstract Double calculateSalary();
}
