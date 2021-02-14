package com.lin.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
 
	private String[] testData = {
			"test string 1",
			"test string 2",
			"test string 3"
	};
	
	private Random testRandom = new Random();
	
	
	@Override
	public String getFortune() {
		int randomNumber = testRandom.nextInt(testData.length);
		return testData[randomNumber];
	}

}
