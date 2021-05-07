package co.masg.handsontest.rest.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ErrorDto {

    private String message;
}
