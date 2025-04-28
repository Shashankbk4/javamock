package com.fmc;

import org.springframework.stereotype.Component;

@Component
public class Spotify implements AudioPlayer {

	public void playAudio(String track) {
		System.out.println("Spotify music : - "+ track);
		
	}

	public void pauseAudio() {
	System.out.println("spotify music  audio is pause->");
		
	}

	public void stopAudio() {
	
		System.out.println("spotify music  stop audio >");
	}

}
