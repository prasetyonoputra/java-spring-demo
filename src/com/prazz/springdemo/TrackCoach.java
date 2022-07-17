package com.prazz.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneServices fortuneService;

	public TrackCoach() {};
	
	public TrackCoach(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

}
