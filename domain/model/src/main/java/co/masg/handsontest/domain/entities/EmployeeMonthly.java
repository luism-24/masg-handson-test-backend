package co.masg.handsontest.domain.entities;

import lombok.Data;

@Data
public class EmployeeMonthly extends Employee {

    @Override
    public Double calculateSalary() {
        return this.getMonthlySalary() * 12;
    }
}
