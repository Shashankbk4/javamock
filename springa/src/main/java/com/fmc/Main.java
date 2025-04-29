package com.fmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.ProjectConfig;
import com.fmc.service.Song;
import com.fmc.service.VehicleServices;

public class Main {
 
	 
	public static void main(String[] args) {
	
		
	 ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
     
	 Song song = new Song("My Favorite Song");
     
      VehicleServices vehicleServices=context.getBean(VehicleServices.class);
	
		boolean vehicleStatus=true;
		
		vehicleServices.moveVehicle(vehicleStatus);
		
		
		
      
}
}
