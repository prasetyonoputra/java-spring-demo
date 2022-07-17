package com.prazz.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneServices fortuneService;

	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricetCoach: inside no-arg constructor");
	};
	
	// our setter method
	public void setFortuneService(FortuneServices fortuneService) {
		System.out.println("CricetCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
