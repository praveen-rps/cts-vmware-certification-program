package springjdbctemplatedemo.service;

import java.util.List;

import springjdbctemplatedemo.model.Notes;
import sprinjdbctemplate.dao.NotesDao;

public class NotesServiceImpl implements NotesService {
	
	NotesDao dao;
	
	public NotesServiceImpl() {
		
	}

	public NotesDao getDao() {
		return dao;
	}

	public void setDao(NotesDao dao) {
		this.dao = dao;
	}

	public NotesServiceImpl(NotesDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Notes> findAllNotes() {
		// TODO Auto-generated method stub
		return dao.findAllNotes();
	}

	@Override
	public String insertNotes(Notes notes) {
		// TODO Auto-generated method stub
		return dao.insertNotes(notes);
	}

	@Override
	public Notes findNotes(int pid) {
		// TODO Auto-generated method stub
		return dao.findNotes(pid);
	}

}
