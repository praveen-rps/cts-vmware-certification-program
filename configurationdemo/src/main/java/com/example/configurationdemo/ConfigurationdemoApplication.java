package com.example.configurationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.example.configurationdemo.models.DbModel;

@SpringBootApplication
//@PropertySource("file:e://datadbs.properties")
public class ConfigurationdemoApplication implements CommandLineRunner{
	
	//@Autowired
	//DbModel dbModel;

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ConfigurationdemoApplication.class, args);
		DbModel dbmodel = context.getBean(DbModel.class);
		System.out.println(dbmodel);
		
	}

	/*
	@Bean
	public DbModel getDbModelObject(Environment env) {
		String db = env.getProperty("db.url");
		String user = env.getProperty("db.username");
		String pwd = env.getProperty("db.password");
		String tbl = env.getProperty("db.table");
		return new DbModel(db,user,pwd,tbl);
		
	}
	*/
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//AnnotationConfigApplicationContext context = 
			//	new AnnotationConfigApplicationContext(DataProjectConfiguration.class);
	//	//String str = (String)context.getBean("dbs");
		//System.out.println(str);
		//System.out.println("The db values read from prperties file are:");
		//System.out.println(dbModel);
		
	}

}
