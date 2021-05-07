package co.masg.handsontest.configuration;

import co.masg.handsontest.domain.gateways.EmployeeGateway;
import co.masg.handsontest.usecase.GetEmployeeUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public GetEmployeeUseCase getEmployeeUseCase(EmployeeGateway employeeGateway){
        return new GetEmployeeUseCase(employeeGateway);
    }
}
