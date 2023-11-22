package com.learnSphere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.entities.Users;
import com.learnSphere.services.StudentService;
import com.learnSphere.services.UsersService;

import jakarta.servlet.http.HttpSession;
@Controller
public class StudentController {
	@Autowired
	StudentService sservice;
	
	@Autowired
	UsersService uservice;
	
	@GetMapping("/purchase")
	public String purchase(Model model) {
		List<Course> courseList=sservice.fetchCourseList();
		model.addAttribute("courseList", courseList);
		return "purchaseCourse";
}
	@GetMapping("/myCourses")
	public String myCourses(Model model, HttpSession session) {
		
		Users loggedUser=(Users) session.getAttribute("loggedInUser");
		
		String email=loggedUser.getEmail();
				
		Users user=uservice.findUserByEmail(email);
			
		List<Course> courseList=user.getCourseList();
		model.addAttribute("courseList",courseList);
		return "myCourses";
	}
	@GetMapping("/viewLesson")
	public String viewLesson(@RequestParam("lessonId")int lessonId,
							Model model,HttpSession session) {
	
		
		
		Lesson lesson = sservice.getLesson(lessonId);
		// Extract the YouTube video id from the URL
	    String youtubeUrl = lesson.getLessonLink();
	    
	    String videoId = youtubeUrl.substring(youtubeUrl.indexOf("=") + 1);
	    lesson.setLessonLink(videoId);
		
		
		model.addAttribute("lesson",lesson);
		
		
		return "myLesson";
	}
}