package springcoreexamples.dao;

import org.springframework.stereotype.Component;

@Component("mysql")
public class DatabaseDaoImpl implements DatabaseDao {

	@Override
	public String getDriver() {
		// TODO Auto-generated method stub
		return "mysql driver";
	}

	@Override
	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return "mysql datbase";
	}

}
