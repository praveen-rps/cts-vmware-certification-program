package com.example.jpa.springdatajpademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.springdatajpademo.entities.Notes;
import com.example.jpa.springdatajpademo.service.NotesService;

@RestController
@RequestMapping("/notes")
public class NotesController {
	
	@Autowired
	NotesService service;
	
	@GetMapping("/{author}/{title}")
	public List<Notes> findAuthorTitleNotes(@PathVariable String author,
			@PathVariable String title){
		return service.findNotesByAuthorAndTitle(author, title);
	}
	
	@GetMapping("/pid/{pid}")
	@ResponseStatus(HttpStatus.OK)
	public List<Notes> searcNotes(@PathVariable String pid){
		return service.findNotes(pid);
	}
	
	@GetMapping("/author/{name}")
	@ResponseStatus(HttpStatus.OK)
	public List<Notes> searchByAuthor(@PathVariable String name) {
		return service.searchNotesByAuthor(name);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Notes insertNotes(@RequestBody Notes notes) {
		return service.addNotes(notes);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Notes> findAllNotes(){
		return service.findallNotes();
	}

}
