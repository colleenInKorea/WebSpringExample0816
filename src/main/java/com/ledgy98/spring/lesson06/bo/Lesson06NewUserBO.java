package com.ledgy98.spring.lesson06.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgy98.spring.lesson04.dao.NewUserDAO;

@Service
public class Lesson06NewUserBO {
	
	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addNewUser(String name, String yyyymmdd, String introduce, String email) {
		return newUserDAO.insertNewUser(name, yyyymmdd, introduce, email);
	}
	
	public boolean existName(String name) {
			
		if(newUserDAO.selectCountName(name)== 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
