package com.example.jpa.springdatajpademo.entities.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa.springdatajpademo.entities.Notes;

public interface NotesDao extends JpaRepository<Notes,Integer>{
	
	public List<Notes> findByAuthor(String author);
	//public List<Notes> findByPidGreaterThan(int pid);
	public List<Notes> findByAuthorGreaterThan(String author);
	
	@Query("select n from Notes n where n.author=?1 and n.title=?2")
	public List<Notes> findNotesByAuthorAndTitle(String author, String title);

}
