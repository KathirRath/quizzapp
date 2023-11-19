package com.kathir.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kathir.quizapp.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>{

}
