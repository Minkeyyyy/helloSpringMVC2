package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CourseDAO {

	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		 this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public List<Course> getCourse(){
		String sqlStatement = "select * from takinglectures";
		
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}
	
	
	
	public List<Course> Sum(){
		String sqlStatement = "select year, term, sum(grade), subject from takinglectures group by year, term";
		
		return jdbcTemplateObject.query(sqlStatement, new SumMapper());
	}
	
	public List<Course> Sum2(){
		String sqlStatement = "select division, sum(grade) from takinglectures group by division";
		
		return jdbcTemplateObject.query(sqlStatement, new Sum2Mapper());
	}

	public boolean insert(Course course){
		
		int year = course.getYear();
		int term = course.getTerm();
		String code = course.getCode();
		String subject = course.getSubject();
		String division = course.getDivision();
		int grade = course.getGrade();

		
		String sqlStatement = "insert into takinglectures (year, term, code, subject, division, grade) values(?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{year, term, code, subject, division, grade}) ==1);
	}
	

}






