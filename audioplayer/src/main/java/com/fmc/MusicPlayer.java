package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	private final AudioPlayer audioPlayer;

	@Autowired
	public MusicPlayer(@Qualifier("amazonMusic")  AudioPlayer audioPlayer) {
		super();
		this.audioPlayer = audioPlayer;
	}
	
	public void play(String track) {
		
		audioPlayer.playAudio(track);
	}
	
	public void pause() {
		audioPlayer.pauseAudio();
	}
	public void stop() {
		audioPlayer.stopAudio();
	}
}
