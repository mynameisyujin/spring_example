package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;

@RestController // @controller + @responsebody
public class Lesson02Ex01RestController {
	
	@Autowired // DI(spring bean을 주입)
	private UsedGoodsBO usedGoodsBO; // 이름 지을 때는 소문자로 시작

	// 요청 url: http://localhost/lesson02/ex01
	@RequestMapping("lesson02/ex01")
	public List<UsedGoods> ex01() { 
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		return usedGoodsList; // ﻿컨트롤러가 요청을 받고 응답을 내릴 때 return으로 내림 > json으로 출력
		
	}
	
	
	
	
}
