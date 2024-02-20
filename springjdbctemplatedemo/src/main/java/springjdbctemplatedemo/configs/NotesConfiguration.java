package springjdbctemplatedemo.configs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springjdbctemplatedemo.service.NotesServiceImpl;
import sprinjdbctemplate.dao.NotesDaoImpl;

@Configuration
public class NotesConfiguration {
	
	@Bean
	public DataSource getDataSourceObject() {
		
		DriverManagerDataSource  ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/citibank");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSourceObject());
	}
	
	@Bean("dao")
	public NotesDaoImpl getNoteDao() {
		NotesDaoImpl dao = new NotesDaoImpl();
		dao.setTemplate(getTemplate());;
		return dao;
		
	}
	
	@Bean("service")
	public NotesServiceImpl getNotesService() {
		NotesServiceImpl service = new NotesServiceImpl();
		service.setDao(getNoteDao());
		return service;
	}

}
