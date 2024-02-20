package springcoreexamples.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springcoreexamples.dao.DatabaseDao;


@Component
public class DatabaseServiceImpl implements DatabaseService {
	
	@Autowired
	//DatabaseDaoImpl dao;
	@Qualifier("mysql")
	DatabaseDao dao;

	@Override
	public String getDriver() {
		// TODO Auto-generated method stub
		return dao.getDriver();
	}

	@Override
	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return dao.getDatabaseName();
	}

}
