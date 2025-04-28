package com.fmc1;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speakers {

	public void playMusic() {
		System.out.println("sony speakers are used to play music");
		
	}

}
