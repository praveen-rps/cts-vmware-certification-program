package sprinjdbctemplate.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;

import springjdbctemplatedemo.model.Notes;
import springjdbctemplatedemo.model.NotesRowMapper;

public class NotesDaoImpl implements NotesDao{
	
	
	public JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Notes> findAllNotes() {
		// TODO Auto-generated method stub
		String sql = "select * from notes";
		return template.query(sql, new NotesRowMapper());
		//return null;
	}

	@Override
	public String insertNotes(Notes notes) {
		// TODO Auto-generated method stub
		
		String sql = "insert into notes values (?,?,?,?)";
		template.update(sql,notes.getPid(),notes.getAuthor(),notes.getTitle(),notes.getDescription());
		return "notes inserted";
	}

	@Override
	public Notes findNotes(int pid) {
		// TODO Auto-generated method stub
		String sql = "select * from notes where pid=?";
		/*
		List<Notes> notes = template.query(sql,new NotesRowMapper());
		List<Notes> n = notes.stream()
				        .filter(note->note.getPid()==pid)
				        .map(n1->n1).collect(Collectors.toList());
				        //
		return n.get(0);
				        */
		return template.queryForObject(sql,new NotesRowMapper(),pid );
		
	}

}
