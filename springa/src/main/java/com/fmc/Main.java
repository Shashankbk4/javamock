package com.fmc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.ProjectConfig;
import com.fmc.service.VehicleServices;

public class Main {
 
	public static void main(String[] args) {
	
	 ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		VehicleServices vehicleServices=context.getBean(VehicleServices.class);
		
		vehicleServices.moveVehicle(true);
		

}
}
