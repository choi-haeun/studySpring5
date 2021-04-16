package com.spring.board.newEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter(onMethod_ = @Autowired)//자동으로 setChef() 컴파일시 자동생성
	private Chef chef;
}
