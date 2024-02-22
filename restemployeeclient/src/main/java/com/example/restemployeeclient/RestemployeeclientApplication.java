package com.example.restemployeeclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestemployeeclientApplication implements CommandLineRunner{
	
	@Autowired
	RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RestemployeeclientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(5001,"kiran","quality");
		//Employee employees = restTemplate.getForObject("http://localhost:8080/1001", Employee.class);
		Employee emp1 = restTemplate.postForObject("http://localhost:8080", emp, Employee.class);
		//employees.forEach(System.out::println);
		System.out.println(emp1);
	//	System.out.println(rs.getStatusCode());
	}

}
