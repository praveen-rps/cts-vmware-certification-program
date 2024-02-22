package com.example.jpa.springdatajpademo.service;

import java.util.List;
import java.util.Optional;

import com.example.jpa.springdatajpademo.entities.Notes;

public interface NotesService {
	
	public List<Notes> findallNotes();
	public Notes addNotes(Notes notes);
	public Optional<Notes> searchNotes(int pid);
	public void deleteNotes(int pid);
	public Notes updateNotes(Notes notes);
	public List<Notes> searchNotesByAuthor(String author);
	//public List<Notes> findNotes(int pid);
	public List<Notes> findNotes(String author);
	public List<Notes> findNotesByAuthorAndTitle(String author, String title);

}
