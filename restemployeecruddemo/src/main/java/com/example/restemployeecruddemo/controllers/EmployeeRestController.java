package com.example.restemployeecruddemo.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.restemployeecruddemo.exceptions.EmployeeNotFoundException;
import com.example.restemployeecruddemo.model.Employee;
import com.example.restemployeecruddemo.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
public class EmployeeRestController {
	
	
	EmployeeService service;
	
	public EmployeeRestController(EmployeeService service) {
		this.service=service;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> showAllEmployees(){
		return service.getAllEmployees();
	}
	
	@PostMapping
	public Employee addEmployee(@RequestBody @Valid Employee employee) {
		Employee emp = service.insertEmployee(employee);
		URI location = ServletUriComponentsBuilder
			       .fromCurrentRequestUri()
			      // .path("/add")
			       .buildAndExpand()
			       .toUri(); 
	
			//  return ResponseEntity.created(location).body(employee);
		return emp;
	}
	
	@DeleteMapping("/{empid}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeEmployee(@PathVariable int empid) throws EmployeeNotFoundException{
		
		service.deleteEmployee(empid);
		
	}
	
	@GetMapping("/{empid}")
	@ResponseStatus(HttpStatus.OK)
	public Employee getEmployeeInfo(@PathVariable int empid) throws EmployeeNotFoundException{
		return service.searchEmployee(empid);
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateEmployeeInfo(@RequestBody Employee employee)
	{
		Employee emp = service.updateEmployee(employee);
		URI location = ServletUriComponentsBuilder
			       .fromCurrentRequestUri()
			      // .path("/add")s
			       .buildAndExpand()
			       .toUri(); 
	
			  return ResponseEntity.created(location).body(emp);
	}
	
	
	

}
