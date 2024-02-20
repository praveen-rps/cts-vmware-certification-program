package com.example.profiles.springprofilesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringprofilesdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringprofilesdemoApplication.class, args);
		Database db = (Database)context.getBean(Database.class);
		System.out.println(db.getUser()+" "+db.getDriver()+" "+db.getPassword());
		
	}

}
