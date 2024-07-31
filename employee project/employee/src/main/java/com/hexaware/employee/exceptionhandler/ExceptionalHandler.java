package com.hexaware.employee.exceptionhandler;

import com.hexaware.employee.dto.CustomException;
import com.hexaware.employee.dto.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionalHandler {
   @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CustomException> handleException(ResourceNotFoundException resourceNotFoundException){
       CustomException customException=new CustomException(resourceNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
       return new ResponseEntity(customException, HttpStatus.NOT_FOUND);
   }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomException> handleException(MethodArgumentNotValidException methodArgumentNotValidException){
        CustomException customException=new CustomException(methodArgumentNotValidException.getMessage(),HttpStatus.BAD_REQUEST);
        return new ResponseEntity(customException, HttpStatus.BAD_REQUEST);
    }
}