package com.prazz.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneServices fortuneSevices;
	
	public BaseballCoach(HappyFortuneServices happyFortuneServices) {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}
}
