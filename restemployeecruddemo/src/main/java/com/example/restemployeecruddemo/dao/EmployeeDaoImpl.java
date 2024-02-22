package com.example.restemployeecruddemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.restemployeecruddemo.exceptions.EmployeeNotFoundException;
import com.example.restemployeecruddemo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> employees;

	public EmployeeDaoImpl() {
		employees = new ArrayList<>();
		employees.add(new Employee(1001, "praveen", "fiance"));
		employees.add(new Employee(1002, "anil", "operations"));
		employees.add(new Employee(1003, "kishore", "quality"));
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if (employees.add(employee))
			return employee;
		else
			return null;
	}

	@Override
	public void deleteEmployee(int empid) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		Employee emp = searchEmployee(empid);
		employees.remove(emp);
	}

	@Override
	public Employee searchEmployee(int empid) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub

		return employees.stream()
				.filter(emp -> emp.getEmpid() == empid)
				.map(e -> e).findFirst()
				.orElseThrow(()-> new EmployeeNotFoundException());
		// return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException{
		// TODO Auto-generated method stub
		
		Employee emp = searchEmployee(employee.getEmpid());
		if(emp==null)
		return null;
		else
		{
			emp.setName(employee.getName());
			emp.setDepartment(employee.getDepartment());
			employees.add(emp);
		}
		return emp;
	}

}
