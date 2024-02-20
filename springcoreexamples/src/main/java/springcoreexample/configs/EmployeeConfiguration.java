package springcoreexample.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import springcoreexamples.model.Address;
import springcoreexamples.model.Employee;
import springcoreexamples.model.Person;

	@Configuration
public class EmployeeConfiguration {
		
		
		@Bean
		public Address getAddressBean() {
			return new Address();
		}
	
		@Bean("person")
		@Scope("prototype")
		public Person getPersonData() {
			Person p = new Person();
			p.setId(9);
			p.setName("Satish");
			p.setAddress(getAddressBean());
			return p;
		}
	
	@Bean("employee1")
	public Employee createEmployee1() {
		return new Employee();
	}
	
	@Bean("employee2")
	public Employee createEmployee2() {
		return new Employee(2001,"Anil","Quality");
	}
}	
