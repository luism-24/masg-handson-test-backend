package co.masg.handsontest.clients;

import co.masg.handsontest.config.FeignClientConfiguration;
import co.masg.handsontest.data.EmployeeData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "Employee",
        url = "${external-api.url}",
        configuration = FeignClientConfiguration.class)
public interface EmployeeClient {

    @GetMapping(value = "/api/Employees")
    List<EmployeeData> getAll();
}
