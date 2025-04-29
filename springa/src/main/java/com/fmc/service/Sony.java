package com.fmc.service;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speakers {

	public void playMusic() {
		System.out.println("sony speakers are used to play music");
		
	}

}
