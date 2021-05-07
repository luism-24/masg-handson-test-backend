package co.masg.handsontest.domain.entities;

public class EmployeeHourly extends Employee {
    
    @Override
    public Double calculateSalary() {
        return 120 * this.getHourlySalary() * 12;
    }
}
