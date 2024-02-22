package com.example.restemployeeclient;






public class Employee {
	
	//@NotNull(message="Employee id should not be blank")
	//@Min(value=3000,message="empid should start with 3000")
	int empid;
		
	//@NotNull(message="Name should not be null")
	String name;
	
	//@NotNull(message="Department should not be null")
	String department;
	
	public Employee() {
		
	}

	public Employee(int empid, String name, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
	}
	

}
