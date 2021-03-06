package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper implements RowMapper<Course> {

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

		Course course = new Course();

		course.setYear(rs.getInt("year"));
		course.setTerm(rs.getInt("term"));
		course.setCode(rs.getString("code"));
		course.setSubject(rs.getString("subject"));
		course.setDivision(rs.getString("division"));
		course.setGrade(rs.getInt("grade"));

		return course;
	}

}
