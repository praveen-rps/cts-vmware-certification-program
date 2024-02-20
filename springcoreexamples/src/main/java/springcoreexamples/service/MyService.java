package springcoreexamples.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	
	@Value("${db.user}")
	String user;
	
	@Value("${db.password}")
	String password;
	
	@Value("${db.database}")
	String database;
	
	public MyService() {
		
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

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "MyService [user=" + user + ", password=" + password + ", database=" + database + "]";
	}
	

}
