package co.masg.handsontest.domain.entities;

import lombok.Data;

@Data
public class EmployeeHourly extends Employee {
    
    @Override
    public Double calculateSalary() {
        return 120 * this.getHourlySalary() * 12;
    }
}
