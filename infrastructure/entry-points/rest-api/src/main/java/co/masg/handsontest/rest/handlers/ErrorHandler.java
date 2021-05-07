package co.masg.handsontest.rest.handlers;

import co.masg.handsontest.domain.exception.ApplicationException;
import co.masg.handsontest.domain.exception.BusinessException;
import co.masg.handsontest.rest.dtos.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({ApplicationException.class, BusinessException.class})
    public ResponseEntity<ErrorDto> handleError(Exception exception){
        return new ResponseEntity<>(ErrorDto.builder().message(exception.getMessage()).build(), HttpStatus.BAD_REQUEST);
    }
}
