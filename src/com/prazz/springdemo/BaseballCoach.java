package com.prazz.springdemo;

public class BaseballCoach implements Coach {
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on atting practices";
	}
}
