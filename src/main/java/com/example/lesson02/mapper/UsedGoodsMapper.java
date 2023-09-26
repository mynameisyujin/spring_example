package com.example.lesson02.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.lesson02.domain.UsedGoods;

@Repository
public interface UsedGoodsMapper {
	
	// input(BO-Service가 요청하는 것) : 파라미터 x
	// output(BO-Service에게 결과 돌려줌) : List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList(); //이름: 쿼리와 가까워지니 select  + UsedGoodsList를 돌려줌
	// 인터페이스라 중괄호 안 씀
	
}
