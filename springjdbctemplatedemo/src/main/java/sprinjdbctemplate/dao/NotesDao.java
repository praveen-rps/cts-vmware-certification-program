package sprinjdbctemplate.dao;

import java.util.List;

import springjdbctemplatedemo.model.Notes;

public interface NotesDao {
	public List<Notes> findAllNotes();

	public String insertNotes(Notes notes);

	public Notes findNotes(int pid);

}
