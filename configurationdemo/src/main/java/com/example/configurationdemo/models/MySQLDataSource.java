package com.example.configurationdemo.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySQLDataSource {
	
	@Bean("driver")
	public String getDriver() {
		return "mysql driver";
	}
	
	@Bean("dbs")
	public String getDatabase() {
		return "mysql database";
	}


}
