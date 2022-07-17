package com.prazz.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneServices fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricetCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricetCoach: inside setter method - setTeam");
		this.team = team;
	}

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
