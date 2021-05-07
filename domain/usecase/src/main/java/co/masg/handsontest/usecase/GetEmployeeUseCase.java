package co.masg.handsontest.usecase;

import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.gateways.EmployeeGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class GetEmployeeUseCase {

    private final EmployeeGateway employeeGateway;

    public List<Employee> getAllEmployees(){
        return employeeGateway.getAllEmployees()
                .stream()
                .map(this::setAnnualSalary)
                .collect(Collectors.toList());
    }

    public Employee getEmployeeById(Integer id){
        return setAnnualSalary(employeeGateway.getEmployeeById(id));
    }


    private Employee setAnnualSalary(Employee employee){
        employee.setAnnualSalary(employee.calculateSalary());
        return employee;
    }
}
