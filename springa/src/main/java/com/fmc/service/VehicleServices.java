package com.fmc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

	 @Autowired
	    private Speakers speakers;  

	    @Autowired
	    private Tyre tyres;        

	    public  String playMusic(boolean vehicleStarted, Song song) {
	        String music = null;
	        if (vehicleStarted) {
	            music = speakers.makeSound(song);
	        } else {
	            music = "Vehicle not started to play music";
	        }
	        return music;
	    }

	    public String moveVehicle(boolean vehicleStarted) {
	       
	    	String status=null;
	       
	    	if (vehicleStarted) {
	            status = tyres.rotate();
	            System.out.println(status);
	            applyBrake(vehicleStarted);
	         } 
	    	else {
	            
	        	status = "Vehicle not started to move";
	        }
	    
	        return status;
	    }

	    public String applyBrake(boolean vehicleStarted) {
	        String status = null;
	        if (vehicleStarted) {
	            status = tyres.stop();
	            System.out.println(status);
	        } else {
	            status = "Vehicle not started to apply brake";
	        }
	        return status;
	    }
		
		
	
}
