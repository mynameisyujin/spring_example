package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // : @ResponseBody + @Controller, spring bean
public class Lesson01Ex01RestController {
	
	// String 출력
	// 요청 URL: http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>RestController를 사용해 String을 리턴해본다</h3>";
	}
	
	// Map 출력 > json string 출력
	// 요청 URL: http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("a", "1111");
		map.put("b", "2222");
		map.put("c", "3333");
		
		return map;
	}
	
	// 객체(내가 만든 클래스) > json string 출력
	// 요청 URL: http://localhost:8080/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data(); // 일반 JAVA bean(객체) Spring이 관여하지 않음
		data.setId(1);
		data.setName("김유진");
		
		return data; // 일반 JAVA bean 객체도 json으로 내려간다. (key-value 있는 건 다 json임)
		
	}
	
	// 요청 URL: http://localhost:8080/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data(); // 일반 JAVA bean(객체) Spring이 관여하지 않음
		data.setId(1);
		data.setName("김유진");
		
		// return new ResponseEntity<>(data, HttpStatus.OK); // 200 ok
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // 500 error
		
	}
	
	
}
