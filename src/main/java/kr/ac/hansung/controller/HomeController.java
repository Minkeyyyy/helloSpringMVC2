package kr.ac.hansung.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.service.CourseService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private CourseService courseService;

	@Autowired // auto-wiring by type
	public void setOfferService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showhome(Locale locale, Model model) {

		List<Course> course = courseService.getSum();
		model.addAttribute("courses",course);
		
		List<Course> course2 = courseService.getSum2();
		model.addAttribute("course2",course2);
		
		return "home";
	}
	
}
