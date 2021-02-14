package com.lin.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.team}")
	private String team;
	
	public TennisCoach() {
		System.out.println("Tennis Coach: In construct method.");
	}
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Tennis Coach: In setter method.");

		this.fortuneService = fortuneService;
	}
    */
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void getCoach() {
		System.out.println("Tennis Coach: email is " + this.email);
		System.out.println("Tennis Coach: team is " + this.team);
	}

}
