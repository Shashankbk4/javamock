package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.fmc.AmazonMusic;
import com.fmc.AppleMusic;
import com.fmc.Spotify;

@Component
@ComponentScan("com.fmc")
public class ProjectConfig {

	@Bean
	public AppleMusic appleMusic() {
		AppleMusic appleMusic1=new AppleMusic();
		return appleMusic1;
	}
	
	@Bean
	public Spotify spotifyMusic() {
		Spotify sp=new Spotify();
		return sp;
	}
	
	@Bean
	public AmazonMusic amazonMusic() {
		AmazonMusic am=new AmazonMusic();
		return am;
	}
}
