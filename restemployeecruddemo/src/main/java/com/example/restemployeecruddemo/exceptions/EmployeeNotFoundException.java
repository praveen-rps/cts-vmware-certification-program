package com.example.restemployeecruddemo.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException() {
		super("Employee Data Not Found");
	}

}
