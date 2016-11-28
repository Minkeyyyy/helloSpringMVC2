package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.dao.CourseDAO;

@Service("courseService")
public class CourseService {

	
	private CourseDAO courseDAO;

	@Autowired	
	public void setOfferDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}
	
	public List<Course> getCurrent(){
		
		return courseDAO.getCourse();
	}
	
	public List<Course> getSum(){
		
		return courseDAO.Sum();
	}

	public List<Course> getSum2(){
		
		return courseDAO.Sum2();
	}

	public void insert(Course course) {
		courseDAO.insert(course);
	}
	
}
