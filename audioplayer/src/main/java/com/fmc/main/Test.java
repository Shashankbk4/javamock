package com.fmc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.MusicPlayer;
import com.fmc.config.ProjectConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		MusicPlayer musicPlayer=context.getBean(MusicPlayer.class);
		
		musicPlayer.play(" song");
		musicPlayer.pause();
		musicPlayer.stop();
	}
}
