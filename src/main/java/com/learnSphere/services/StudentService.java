package com.learnSphere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
@Service
public interface StudentService {
	List<Course> fetchCourseList();
	Course fecthCourse(int courseId);
	Lesson getLesson(int lessonId);
}
