package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.service.CourseService;

@Controller
public class CourseController {

	private CourseService courseService;

	@Autowired // auto-wiring by type
	public void setOfferService(CourseService courseService) {
		this.courseService = courseService;
	}
    


	@RequestMapping("/course")
	public String course(Model model) {
		
		List<Course> courses = courseService.getCurrent();
		model.addAttribute("courses",courses);
		return "course";
		
	}
	
	@RequestMapping("/register")
	public String register() {

		return "register";
	}
	
	@RequestMapping("/doregister")
	public String doRegister(Model model, Course course) {
		
		courseService.insert(course);
		model.addAttribute("insertedOffer",course);	

		return "registered";
		
	}

	


}
