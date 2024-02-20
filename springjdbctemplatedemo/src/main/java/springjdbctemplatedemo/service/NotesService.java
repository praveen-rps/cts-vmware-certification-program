package springjdbctemplatedemo.service;

import java.util.List;

import springjdbctemplatedemo.model.Notes;

public interface NotesService {
	
	public List<Notes> findAllNotes();
	public String insertNotes(Notes notes);
	public Notes findNotes(int pid);

}
