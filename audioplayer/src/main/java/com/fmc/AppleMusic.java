package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class AppleMusic implements AudioPlayer {

	public void playAudio(String track) {
		System.out.println("apple music : - "+ track);
		
	}

	public void pauseAudio() {
	System.out.println("apple music  audio is pause->");
		
	}

	public void stopAudio() {
	
		System.out.println("apple music  stop audio >");
	}

	
}
