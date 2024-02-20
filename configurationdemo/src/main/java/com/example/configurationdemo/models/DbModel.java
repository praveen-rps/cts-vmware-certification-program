package com.example.configurationdemo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbModel {
	
	@Value("${db.url}")
	String url;
	@Value("${db.username}")
	String username;
	@Value("${db.password}")
	String password;
	@Value("${db.table}")
	String table;
	public DbModel() {
		
	}
	public DbModel(String url, String username, String password, String table) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		this.table=table;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	@Override
	public String toString() {
		return "DbModel [url=" + url + ", username=" + username + ", password=" + password + ", table=" + table + "]";
	}
	
	

}
