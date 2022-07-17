package com.prazz.springdemo;

public class HappyFortuneServices implements FortuneServices {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
