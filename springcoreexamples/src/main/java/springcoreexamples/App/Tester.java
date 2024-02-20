package springcoreexamples.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcoreexample.configs.PersonConfiguration;
import springcoreexamples.service.MyService;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PersonConfiguration.class);
		
		MyService myService = (MyService) context.getBean(MyService.class);
		System.out.println(myService);
		//Employee emp = (Employee) context.getBean("employee");
		
		//Employee emp = (Employee) context.getBean(Employee.class);
		
		//Employee emp = (Employee) context.getBean("employee2");
		
		//Address addr = (Address) context.getBean("address");
	
	//	System.out.println(addr.getDno()+" "+addr.getStreet()+" "+addr.getCity());
		
		//System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getDepartment());
		/*
		Person person1 = (Person) context.getBean("person");
		Person person2 = (Person) context.getBean("person");
		System.out.println("Person hashcode :"+ person1.hashCode());
		System.out.println("Person's address hashcode :"+person1.getAddress().hashCode());
		System.out.println("Person Hashcode :"+person2.hashCode());
		System.out.println("persons address hashcode:"+person2.getAddress().hashCode());
		//System.out.println(person.getId()+" "+person.getName()+" "+person.getAddress());
		 * */
		 /*
		 
		 DatabaseServiceImpl service = context.getBean(DatabaseServiceImpl.class);
		 System.out.println(service.getDriver());
		 System.out.println(service.getDatabaseName());
		 */
	}
}
