package com.lin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);
		
		// check if they are the same
		System.out.println("they are the same: " + result);
		System.out.println("\nmemory of theCoach: " + theCoach);
		System.out.println("memory of theCoach: " + alphaCoach);
		
		context.close();
		
	}

}
