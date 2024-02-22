package com.example.restemployeecruddemo.model;





import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	//@NotNull(message="Employee id should not be blank")
	@Min(value=3000,message="empid should start with 3000")
	int empid;
		
	@NotNull(message="Name should not be null")
	String name;
	
	@NotNull(message="Department should not be null")
	String department;

}
