package com.ledgy98.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ledgy98.spring.lesson04.bo.NewUserBO;

@Controller
@RequestMapping("/lesson04")
public class NewUserController {
	
	@Autowired
	private NewUserBO newUserBO;
	
	@RequestMapping("/ex01/1")
	public String addUserView() {
		return "lesson04/addUser";
	}
	
	@RequestMapping("/ex01/add_user")
	public String addUser(
			@RequestParam("name") String name, 
			@RequestParam("yyyymmdd") String yyyymmdd, 
			@RequestParam("introduce") String introduce, 
			@RequestParam("email") String email
			) {
		int count = newUserBO.addNewUser(name, yyyymmdd, introduce, email);
		
		return "lesson04/addUserSuccess";
	}
	
	
}
