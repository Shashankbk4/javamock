package com.fmc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {


	@Autowired
	private Speakers speakers;
	
	@Autowired
	private Tyre tyres;

	public VehicleServices(Speakers speakers, Tyre tyres) {
		super();
		this.speakers = speakers;
		this.tyres = tyres;
	}
	
	public  void moveVehicle(boolean start) {
		
		if(start) {
			System.out.println("vehicle is moving");
			tyres.rotate();
			speakers.playMusic();
		}
		else {
			System.out.println("start vehicle first");
		}
	}
	
	public void  applyBreake(boolean start) {
		
		if(start) {
			System.out.println("apply break");
		}
		else {
			System.out.println("start the vehicle first");
		}
		
	}
}
