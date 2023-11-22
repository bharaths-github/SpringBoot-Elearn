package com.learnSphere.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSphere.entities.Lesson;

public interface LessonRepositary extends JpaRepository<Lesson, Integer> {
	Lesson findByLessonId(int lessonId);
}
