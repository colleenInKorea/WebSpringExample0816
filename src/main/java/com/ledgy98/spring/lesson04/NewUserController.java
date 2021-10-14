package com.ledgy98.spring.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ledgy98.spring.lesson04.bo.NewUserBO;
import com.ledgy98.spring.lesson04.model.NewUser;

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
	
	// 테이블을 셀렉트 해온다 
		// 가장 최근 한사람의 정보만 가져온다 
		//@RequestMapping(path="/ex01/2", method=RequestMethod.GET)
		@GetMapping("/ex01/2")
		public String getUserInfo(Model model) {
			
			NewUser newUser = newUserBO.getLastUser();
			
			model.addAttribute("result", newUser);
			model.addAttribute("subject", "회원정보");
			
			return "lesson04/userInfo";
		}
	
}
