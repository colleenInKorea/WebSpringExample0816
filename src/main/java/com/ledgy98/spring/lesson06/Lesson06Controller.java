package com.ledgy98.spring.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ledgy98.spring.lesson06.bo.Lesson06NewUserBO;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	
	@Autowired 
	private Lesson06NewUserBO newUserBO;
	
	@GetMapping("/add_user_view")
	public String addUserView() {
		return "lesson06/addUser";
	}
	
	@PostMapping("/add_user")
	@ResponseBody
	public Map<String, String> addUser(
			@RequestParam("name") String name
			,@RequestParam("yyyymmdd") String yyyymmdd
			,@RequestParam("introduce") String introduce
			,@RequestParam(value="email", required=false) String email) {
				
		newUserBO.addNewUser(name, yyyymmdd, introduce, email);
			Map<String, String> result = new HashMap<>();
			result.put("result", "success");
		
			return result;
	}
	
	@GetMapping("/is_duplication")
	@ResponseBody
	public Map<String, String> isDuplication(
				@RequestParam("name") String  name){
		// 이름을 받아 왔음 -> DB 에 똑같은 name 이 있는지 확인 -> 그 결과 를 돌려 준다. 
		
				Map<String, String> result = new HashMap<>();
				
				if(newUserBO.existName(name)) {
					result.put("isDuplicate", "true");
				} else {
					result.put("isDuplicate", "false");
				}
				
				return result;
	}
	
	
	
}
