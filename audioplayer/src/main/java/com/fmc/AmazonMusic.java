package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class AmazonMusic implements AudioPlayer {

	public void playAudio(String track) {
		System.out.println("amazon music : - "+ track);
		
	}

	public void pauseAudio() {
	System.out.println("amazone music  audio is pause->");
		
	}

	public void stopAudio() {
	
		System.out.println("amazone music  stop audio >");
	}

}
