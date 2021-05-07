package co.masg.handsontest.rest.controllers;

import co.masg.handsontest.domain.exception.BusinessException;
import co.masg.handsontest.domain.utils.ListUtils;
import co.masg.handsontest.rest.dtos.EmployeeDto;
import co.masg.handsontest.usecase.GetEmployeeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(("api"))
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final GetEmployeeUseCase getEmployeeUseCase;

    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees(){
        return ListUtils.convertList(getEmployeeUseCase.getAllEmployees(), EmployeeDto::convertToEmployeeDto);
    }

    @GetMapping("/employees/{employeeId}")
    public EmployeeDto getEmployeeById(@PathVariable(value = "employeeId") Integer employeeId){
        return EmployeeDto.convertToEmployeeDto(getEmployeeUseCase.getEmployeeById(employeeId));
    }

}
