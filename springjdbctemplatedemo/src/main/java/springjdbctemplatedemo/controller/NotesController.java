package springjdbctemplatedemo.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springjdbctemplatedemo.configs.NotesConfiguration;
import springjdbctemplatedemo.model.Notes;
import springjdbctemplatedemo.service.NotesServiceImpl;

public class NotesController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(NotesConfiguration.class);
		NotesServiceImpl service = (NotesServiceImpl)context.getBean("service");
		/*
		Notes notes1 = new Notes(5555,"Bob","Microservices","best microservice arch");
		service.insertNotes(notes1);
		*/
		//List<Notes> notes = service.findAllNotes();
		//notes.forEach(System.out::println);
		
		System.out.println(service.findNotes(1999));
		

	}

}
