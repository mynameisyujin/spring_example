package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01") // 하단에 들어가는 주소 중 공통되는 주소는 여기에 입력하면 자동으로 메소드에 붙은 주소 매핑보다 먼저 적용된다
@Controller   // Spring 객체임을 등록, Spring bean 등록
public class Lesson01Ex01Controller {
	
	// String 출력
	// 요청 URL: http://localhost:8080/lesson01/ex01/1
	@ResponseBody // 리턴되는 String이 Response(응답) body에 담겨서 내려간다.
	// @RequestMapping("/lesson01/ex01/1") // 주소 매핑
	@RequestMapping("/1")
	public String ex01_1() {
		return "<h1>문자열을 response body로 보내는 예제</h1>";
	}
	
	// Map -> JSON String 출력
	// Web starter에 Jackson이라는 라이브러리가 포함되어 있기 때문
	// 요청 URL: http://localhost:8080/lesson01/ex01/2
	@ResponseBody
	// @RequestMapping("/lesson01/ex01/2")
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 3);
		map.put("자두", 23);
		map.put("낑깡", 54);
		
		return map;
	}

}
