package com.example.configurationdemo.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TableConfigurations {
	
	
	@Bean("dbname")
	public String getDatabaseName() {
		return "cts database";
	}
	
	@Bean("tblname")
	public String getTable() {
		return "cts-employees";
	}

}
