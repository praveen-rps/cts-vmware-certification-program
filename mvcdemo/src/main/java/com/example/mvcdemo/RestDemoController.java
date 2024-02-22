package com.example.mvcdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemoController {
	
	
	@GetMapping("/rest")
	public String restTest() {
		return "Hello, welcome to rest";
	}
	
	@GetMapping("/employee")
	public Employee employee() {
		return new Employee("8888","Aditi","HumanResource");
	}
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.ACCEPTED)
	//@ResponseBody
	public ResponseEntity<Employee> addPost(@RequestBody Employee emp)
	{
		emp.setDept("Finance");
		//return emp;
		
		return new ResponseEntity<>(emp,HttpStatus.ACCEPTED);
		
	}
}
