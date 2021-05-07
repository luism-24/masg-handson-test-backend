package co.masg.handsontest.adapters;

import co.masg.handsontest.clients.EmployeeClient;
import co.masg.handsontest.data.EmployeeData;
import co.masg.handsontest.domain.entities.Employee;
import co.masg.handsontest.domain.entities.EmployeeMonthly;
import co.masg.handsontest.domain.gateways.EmployeeGateway;
import co.masg.handsontest.domain.utils.ListUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeAdapter implements EmployeeGateway {

    private final EmployeeClient employeeClient;

    @Override
    public List<Employee> getAllEmployees() {
        return ListUtils.convertList(employeeClient.getAll(), EmployeeData::convertToEmployee);
    }
}
