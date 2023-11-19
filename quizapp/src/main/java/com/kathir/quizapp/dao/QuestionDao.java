package com.kathir.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.kathir.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{
	
		ResponseEntity<List<Question>> findByCategory(String category);

		@Query(value = "SELECT * FROM question q Where q.category=:category LIMIT :numq", nativeQuery = true)
		List<Question> findRandomQuestionByCategory(String category, int numq);
}
