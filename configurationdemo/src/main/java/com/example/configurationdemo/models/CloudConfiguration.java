package com.example.configurationdemo.models;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("cloud")
@PropertySource("classpath://cloud.properties")
public class CloudConfiguration {
	
	

}
