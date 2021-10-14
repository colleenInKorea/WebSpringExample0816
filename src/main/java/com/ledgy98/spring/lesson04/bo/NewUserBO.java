package com.ledgy98.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ledgy98.spring.lesson04.dao.NewUserDAO;
import com.ledgy98.spring.lesson04.model.NewUser;

@Service
public class NewUserBO {
	
	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addNewUser(String name, String yyyymmdd, String introduce, String email) {
		return newUserDAO.insertNewUser(name, yyyymmdd, introduce, email);
	}
	
	// 최근 한사용자의 데이터 
		public NewUser getLastUser() {
			return newUserDAO.selectLastUser();
		}
}
