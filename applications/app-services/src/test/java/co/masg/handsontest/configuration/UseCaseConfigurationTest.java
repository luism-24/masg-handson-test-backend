package co.masg.handsontest.configuration;

import co.masg.handsontest.domain.gateways.EmployeeGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UseCaseConfigurationTest {

    @Mock
    private EmployeeGateway employeeGateway;

    @InjectMocks
    private UseCaseConfiguration useCaseConfiguration;

    @Test
    void testGetEmployeeUseCaseNotRetunNull() {
        Assertions.assertNotNull(useCaseConfiguration.getEmployeeUseCase(employeeGateway));
    }
}