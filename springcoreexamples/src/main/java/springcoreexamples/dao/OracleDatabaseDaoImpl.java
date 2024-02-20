package springcoreexamples.dao;

import org.springframework.stereotype.Component;

@Component("orcl")
public class OracleDatabaseDaoImpl implements DatabaseDao {

	@Override
	public String getDriver() {
		// TODO Auto-generated method stub
		return "oracle driver";
	}

	@Override
	public String getDatabaseName() {
		// TODO Auto-generated method stub
		return "oracle database";
	}

}
