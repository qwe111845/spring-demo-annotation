package com.lin.springdemo;

import org.springframework.stereotype.Component;

@Component
public class NormalFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your normal lucky day!";
	}

}
