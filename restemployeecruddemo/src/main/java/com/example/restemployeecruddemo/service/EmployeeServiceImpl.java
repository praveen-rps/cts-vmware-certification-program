package com.example.restemployeecruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restemployeecruddemo.dao.EmployeeDao;
import com.example.restemployeecruddemo.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(employee);
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		dao.deleteEmployee(empid);
	}

	@Override
	public Employee searchEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.searchEmployee(empid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employee);
	}

}
