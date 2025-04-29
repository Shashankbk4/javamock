package com.fmc.service;

import org.springframework.stereotype.Component;

@Component
public class VehicleServices {



	private Speakers speakers;
	

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
			applyBreake(true);
			stop(true);
			
			
		}
		else {
			System.out.println("start vehicle first");
		}
	}
	
	public static void stop(boolean start) {
		if(start) {
			System.out.println("vehicle stopped");
		}
		else {
			System.out.println("start vehicle first");
		}
	}
	public static void applyBreake(boolean start) {
		
		if(start) {
			System.out.println("apply break");
		}
		else {
			System.out.println("start the vehicle first");
		}
		
	}
}
