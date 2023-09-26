package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service // service 역할을 함, spring bean
public class UsedGoodsBO {
	
	@Autowired // spring bean(객체)를 가져오는 것 - DI(Dependency Injection)
	// 필드
	private UsedGoodsMapper usedGoodsMapper;
	
	// input(컨트롤러로부터 요청 받음) : 파라미터 X
	// output(컨트롤러한테 돌려줌) : List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList() {
		// public 명은 컨트롤러 입장에서 얻어내는 것
		return usedGoodsMapper.selectUsedGoodsList();
		
	}
}
