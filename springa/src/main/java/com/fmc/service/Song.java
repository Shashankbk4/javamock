package com.fmc.service;

import org.springframework.stereotype.Component;


public class Song {
	  private String title;

	    public Song(String title) {
	        this.title = title;
	    }

	    public String getTitle() {
	        return title;
	    }
}
