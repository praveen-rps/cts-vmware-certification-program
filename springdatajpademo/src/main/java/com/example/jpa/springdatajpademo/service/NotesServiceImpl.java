package com.example.jpa.springdatajpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.springdatajpademo.entities.Notes;
import com.example.jpa.springdatajpademo.entities.dao.NotesDao;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class NotesServiceImpl implements NotesService {
	
	@Autowired
	NotesDao dao;

	@Override
	public List<Notes> findallNotes() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Notes addNotes(Notes notes) {
		// TODO Auto-generated method stub
		return dao.save(notes);
	}

	@Override
	public Optional<Notes> searchNotes(int pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public void deleteNotes(int pid) {
		// TODO Auto-generated method stub
		
		dao.deleteById(pid);

	}

	@Override
	public Notes updateNotes(Notes notes) {
		// TODO Auto-generated method stub
		return dao.save(notes);
	}

	@Override
	public List<Notes> searchNotesByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}

	@Override
	public List<Notes> findNotes(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthorGreaterThan(author);
	}

	@Override
	public List<Notes> findNotesByAuthorAndTitle(String author, String title) {
		// TODO Auto-generated method stub
		return dao.findNotesByAuthorAndTitle(author, title);
	}

}
