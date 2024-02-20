package com.example.profiles.springprofilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database {
	
	@Value("${db.driver}")
	String driver;
	
	@Value("${db.url}")
	String url;
	
	@Value("${db.user}")
	String user;
	
	@Value("${db.password}")
	String password;
	
	public Database() {
		
	}

	public Database(String driver, String url, String user, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}


	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
