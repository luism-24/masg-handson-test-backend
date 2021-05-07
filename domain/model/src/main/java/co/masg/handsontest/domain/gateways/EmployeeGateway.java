package co.masg.handsontest.domain.gateways;

import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.entities.EmployeeMonthly;

import java.util.List;

public interface EmployeeGateway {

    List<Employee> getAllEmployees();
}
