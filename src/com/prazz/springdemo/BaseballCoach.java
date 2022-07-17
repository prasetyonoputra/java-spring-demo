package com.prazz.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private file for dependency
	private FortuneServices fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneServices theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneServce to get fortune
		return fortuneService.getFortune();
	}
	
}
