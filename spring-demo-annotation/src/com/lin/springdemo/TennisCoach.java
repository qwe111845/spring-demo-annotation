package com.lin.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.team}")
	private String team;
	
	public TennisCoach() {
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

	@PostConstruct
	public void postConstruct() {
		System.out.println(">>>Tennis Coach: In postConstruct method.");

	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(">>>Tennis Coach: In preDestroy method.");

	}
}
