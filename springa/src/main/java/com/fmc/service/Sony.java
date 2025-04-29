package com.fmc.service;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speakers {

	  public String makeSound(Song song) {
	        return "Playing song: " + song.getTitle();
	    }

}
