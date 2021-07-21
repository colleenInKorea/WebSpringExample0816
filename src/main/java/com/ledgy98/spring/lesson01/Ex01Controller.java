package com.ledgy98.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Ex01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		return "ex01 response body로 String 보내기 ";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> printMap(){
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 4500);
		map.put("orange", 11500);
		map.put("grape", 3500);
		
		return map;
	}
	
}
