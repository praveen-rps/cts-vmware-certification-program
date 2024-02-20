package springjdbctemplatedemo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NotesRowMapper implements RowMapper<Notes>{

	@Override
	public Notes mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Notes notes = new Notes();
		notes.setPid(rs.getInt(1));
		notes.setAuthor(rs.getString(2));
		notes.setTitle(rs.getString(3));
		notes.setDescription(rs.getString(4));
		return notes;

	}
}
