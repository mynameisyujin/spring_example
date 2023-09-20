package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // JSP를 뿌릴 때는 responsebody가 없는 controller를 사용해야 한다.
public class Lesson01Ex02Controller {
	
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// jsp 경로를 리턴한다. "/WEB-INF/jsp/";
//		return "";
		return "lesson01/ex02"; // jsp view 경로와 이름
	}
}
