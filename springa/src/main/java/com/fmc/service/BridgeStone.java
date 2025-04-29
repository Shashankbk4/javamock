package com.fmc.service;

import org.springframework.stereotype.Component;

@Component
public class BridgeStone implements Tyre {

	
	    public String rotate() {
	       
	    	return "Vehicle is start moving";
	    }

	    public String stop() {
	       
	    return "Vehicle has stopped";
	    }
}
