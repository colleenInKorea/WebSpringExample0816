package com.ledgy98.spring.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.ledgy98.spring.lesson04.model.NewStudent;

@Repository
public interface NewStudentDAO {
	
	public int insertNewStudent(NewStudent newStudent);
}
