package meli.bootcamp.spring.diploma.exception.handler;

import meli.bootcamp.spring.diploma.dto.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FieldValidationHandler {

    private ObjectError sout;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDTO> defaultHandler(MethodArgumentNotValidException e) {
        ExceptionDTO dto = new ExceptionDTO(e.getFieldError().getField(), e.getFieldError().getDefaultMessage());
        return ResponseEntity.badRequest().body(dto);
    }
}
