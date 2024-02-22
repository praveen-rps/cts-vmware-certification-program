package com.example.restemployeecruddemo.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalEmployeeExceptionHandler {
	
	@ResponseStatus(HttpStatus.CONFLICT)  // 409
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String conflict2(EmployeeNotFoundException ex) {
	   // could add the exception, response, etc. as method params
		return ex.getMessage();
	}
	
	
	@ResponseStatus(HttpStatus.CONFLICT)  // 409
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> conflict3(MethodArgumentNotValidException ex) {
	   // could add the exception, response, etc. as method params
		Map<String,String> errs = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(er->{
			String fieldName = ((FieldError) er).getField();
			String errorMesage = er.getDefaultMessage();
			errs.put(fieldName,errorMesage);
		});
	
		return errs;
	}


}
