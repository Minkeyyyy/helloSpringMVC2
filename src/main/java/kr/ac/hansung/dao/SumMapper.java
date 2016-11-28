package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SumMapper implements RowMapper<Course> {

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

		Course course = new Course();

		course.setYear(rs.getInt("year"));
		course.setTerm(rs.getInt("term"));
		course.setGrade(rs.getInt("sum(grade)"));

		return course;
	}

}
