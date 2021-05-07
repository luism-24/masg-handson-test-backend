package co.masg.handsontest.usecase;

import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.gateways.EmployeeGateway;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetEmployeeUseCase {

    private final EmployeeGateway employeeGateway;

    public List<Employee> getAllEmployees(){
        return employeeGateway.getAllEmployees();
    }
}
