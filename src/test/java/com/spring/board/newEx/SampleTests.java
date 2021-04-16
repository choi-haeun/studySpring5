package com.spring.board.newEx;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)//스프링을 실해앟는 역할을 할 것
@ContextConfiguration("fle:src/main/webapp/WEB-INF-spring/root-context.xml")
//지정된 클래스나 문자열을 이용해서 객체들을 스프링 내에 객체로 등록(classpath나 file이용)
@Log4j //lombok을 이용해 logger(로그를 기록하는)변수로 생성
public class SampleTests {

	@Setter(onMethod_ = {@Autowired})	//@Autowired : 인스턴스변수가 스프링으로부터 자동으로 주입해 달라는 표시
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("=================");
		log.info(restaurant.getChef());
		
		
		
	}
}
