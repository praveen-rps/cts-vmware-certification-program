package com.example.restemployeecruddemo.service;

import java.util.List;

import com.example.restemployeecruddemo.exceptions.EmployeeNotFoundException;
import com.example.restemployeecruddemo.model.Employee;

public  interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee insertEmployee(Employee employee);
	public void deleteEmployee(int empid) throws EmployeeNotFoundException;
	public Employee searchEmployee(int empid) throws EmployeeNotFoundException;
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	

}
