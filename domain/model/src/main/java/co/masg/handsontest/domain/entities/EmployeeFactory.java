package co.masg.handsontest.domain.entities;

public class EmployeeFactory {

    public static Employee createEmployee(String contractType) {
        return switch (contractType) {

            case "HourlySalaryEmployee" -> new EmployeeHourly();
            case "MonthlySalaryEmployee" -> new EmployeeMonthly();
            default -> null;
        };

    }
}
