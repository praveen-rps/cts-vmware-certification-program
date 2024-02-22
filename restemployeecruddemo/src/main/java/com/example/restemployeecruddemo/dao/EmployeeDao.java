package com.example.restemployeecruddemo.dao;

import java.util.List;

import com.example.restemployeecruddemo.exceptions.EmployeeNotFoundException;
import com.example.restemployeecruddemo.model.Employee;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	public Employee insertEmployee(Employee employee);
	public void deleteEmployee(int empid) throws EmployeeNotFoundException;
	public Employee searchEmployee(int empid) throws EmployeeNotFoundException;
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	

}
