package com.learnSphere.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
@Service
public interface TrainerService {
	String addCourse(Course course);
	List<Course> fetchAllCourse();
	String addLesson(Lesson lesson);
	String saveCourse(Course course);
}
