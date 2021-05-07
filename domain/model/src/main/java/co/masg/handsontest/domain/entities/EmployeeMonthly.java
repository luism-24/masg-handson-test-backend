package co.masg.handsontest.domain.entities;

public class EmployeeMonthly extends Employee {

    @Override
    public Double calculateSalary() {
        return this.getMonthlySalary() * 12;
    }
}
