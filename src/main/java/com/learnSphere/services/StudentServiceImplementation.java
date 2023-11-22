package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepositary;
import com.learnSphere.repositories.LessonRepositary;
@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	CourseRepositary repo;
	@Autowired
	LessonRepositary lrepo;

	@Override
	public List<Course> fetchCourseList() {
		return repo.findAll();
	}

	@Override
	public Course fecthCourse(int courseId) {
		return repo.findByCourseId(courseId);
	}

	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findByLessonId(lessonId);
	}
	
}
